package com.eghm.dubbo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * @author 水电费
 */
@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = {"hello"})
    public void receive(String record){
        log.error("record" + record);
    }
}
