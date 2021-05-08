package com.eghm.dubbo;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 二哥很猛
 */
@SpringBootApplication
@RestController
public class ConsumerApplication {

    @DubboReference(version = "2.0.0", id = "new")
    private ProviderService newProviderService;

    @DubboReference(version = "1.0.2", id = "old")
    private ProviderService oldProviderService;

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

    @GetMapping("/sendMsgOld")
    public String sendMsg() {
        RpcContext.getContext().setAttachment("rpcName", "附加信息");
        return oldProviderService.echo("二哥很猛");
    }

    @GetMapping("/sendMsgNew")
    public String sendMsgNew() {
        return newProviderService.echo("二哥很猛");
    }
}
