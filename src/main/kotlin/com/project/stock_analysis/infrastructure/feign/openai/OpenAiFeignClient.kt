package com.project.stock_analysis.infrastructure.feign.openai

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader

@FeignClient(name = "\${feign.openai.name}", url = "\${feign.openai.url}")
interface OpenAiFeignClient {
    @PostMapping("/v1/chat/completions")
    fun chat(
        @RequestHeader("Authorization") key: String,
        @RequestBody request: OpenAiChatRequest,
    ): OpenAiChatResponse
}