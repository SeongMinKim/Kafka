package com.example.demo.service

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import kotlin.Throws
import java.io.IOException

@Service
class KafkaConsumer {
    @KafkaListener(topics = ["exam"], groupId = "foo")
    @Throws(IOException::class)
    fun consume(message: String?) {
        println(String.format("Consumed message : %s", message))
    }
}