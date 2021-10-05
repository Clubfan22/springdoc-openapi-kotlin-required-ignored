package com.example.springdoc_kotlin_bugreport

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController {
    @GetMapping("/example")
    fun getExampleDto(): ExampleDto = ExampleDto("", "", "", "", "", "")
}