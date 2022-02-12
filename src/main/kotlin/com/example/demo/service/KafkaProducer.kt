package com.example.demo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer @Autowired constructor(kafkaTemplate: KafkaTemplate<String, String?>) {
    private val kafkaTemplate: KafkaTemplate<String, String?> = kafkaTemplate
    fun sendMessage(message: String?) {
        println(String.format("Produce message : %s", message))
        kafkaTemplate.send(TOPIC, message)
    }

    companion object {
        private const val TOPIC = "exam"
    }

}