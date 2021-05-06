package com.eghm.dubbo;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author 二哥很猛
 */
@SpringBootApplication
@RestController
public class ConsumerApplication {

    @Reference(version = "1.0.2")
    private ProviderService providerService;

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

    @GetMapping("/sendMsg")
    public String sendMsg() {
        return providerService.echo("二哥很猛");
    }
}
