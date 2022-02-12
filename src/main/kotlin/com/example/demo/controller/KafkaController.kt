package com.example.demo.controller

import com.example.demo.service.KafkaProducer
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@RestController
@RequestMapping("/kafka")
class KafkaController(
    private val producer: KafkaProducer
    )
{

    @PostMapping
    fun sendMessage(@RequestParam("message") message: String?): String {
        producer.sendMessage(message)
        return "Success"
    }

}