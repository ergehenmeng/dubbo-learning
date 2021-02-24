package com.eghm.dubbo;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

/**
 * @author 二哥很猛
 */
@SpringBootApplication
public class ConsumerApplication {

    @Reference(version = "1.0.2")
    private ProviderService providerService;

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

    @PostConstruct
    public void init() {
        String echo = providerService.echo("二哥很猛");
        System.out.println(echo);
    }
}
