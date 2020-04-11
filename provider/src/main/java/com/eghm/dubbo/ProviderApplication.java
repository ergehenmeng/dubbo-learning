package com.eghm.dubbo;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author 二哥很猛
 */
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
