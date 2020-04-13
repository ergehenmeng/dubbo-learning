package com.eghm.dubbo.controller;

import com.eghm.dubbo.model.User;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class KafkaController {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    private Gson gson;

    @GetMapping("/kafka/send")
    public String send() {
        User user = new User();
        user.setAge(1);
        user.setName("二哥");
        for (int i = 0; i < 100; i++) {
            kafkaTemplate.send("hello","key" + i, "value");
        }
        return "Success";
    }



}
