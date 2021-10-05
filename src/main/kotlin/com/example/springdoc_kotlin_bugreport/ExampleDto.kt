package com.example.springdoc_kotlin_bugreport

import io.swagger.v3.oas.annotations.media.Schema

data class ExampleDto(
        @field:Schema(description = "Should be required")
        val nonNullable: String,

        @field:Schema(description = "Should not be required")
        val nullable: String?,

        @field:Schema(required = true, description = "Should be required")
        val nonNullableAnnotatedRequired: String,

        @field:Schema(required = false, description = "Should not be required")
        val nonNullableAnnotatedNotRequired: String,

        @field:Schema(required = true, description = "Should be required")
        val nullableAnnotatedRequired: String?,

        @field:Schema(required = false, description = "Should not be required")
        val nullableAnnotatedNotRequired: String?
)
