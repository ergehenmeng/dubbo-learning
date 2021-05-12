package com.eghm.dubbo.service;

import java.util.concurrent.CompletableFuture;

public interface ProviderService {

    String echo(String name);

    String async(String name);

    CompletableFuture<String> future(String name);
}
