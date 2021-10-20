package com.example.springdoc_kotlin_bugreport

import io.swagger.v3.oas.annotations.media.Schema
import org.openapitools.jackson.nullable.JsonNullable

data class ExampleDto(
        @field:Schema(description = "Should be required")
        val nonNullable: String,

        @field:Schema(description = "Should not be required")
        val nullable: String?,

        @field:Schema(required = false, nullable = true, implementation = String::class,
                description = "Can have a value, be null, or be absent")
        val jsonNullable: JsonNullable<String>,
)
