package com.eghm.dubbo;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author 二哥很猛
 */
@SpringBootApplication
@RestController
public class ConsumerApplication {

    @DubboReference(version = "2.0.0", id = "new")
    private ProviderService newProviderService;

    @DubboReference(version = "1.0.0", id = "old", methods = {@Method(name = "async", async = true)})
    private ProviderService oldProviderService;

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

    @GetMapping("/sendMsgV1")
    public String sendMsgV1() {
        RpcContext.getContext().setAttachment("rpcName", "附加信息");
        return oldProviderService.echo("二哥很猛");
    }

    @GetMapping("/SendMsgFuture")
    public String futureSendMsg() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = oldProviderService.future("三哥很猛");
        if (future.isDone()) {
            return future.get();
        }
        future.whenComplete((s, throwable) -> {
            System.out.println("future返回: " + s);
        });
        return "异步处理中";
    }

    /**
     * dubbo无法实现此形式的异步调用, 通过RpcContext.getContext().getFuture()进行回调查询
     * @return
     */
    @GetMapping("/sendMsgAsync")
    @Deprecated
    public String sendMsgAsync() {
        RpcContext.getContext().setAttachment("rpcName", "async");
        String s = oldProviderService.async("二哥很猛");
        System.out.println("异步返回:" + s);
        return s;
    }

    @GetMapping("/sendMsgV2")
    public String sendMsgV2() {
        return newProviderService.echo("二哥很猛");
    }
}
