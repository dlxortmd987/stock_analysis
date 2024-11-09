package com.project.stock_analysis.infrastructure.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping

@FeignClient(name = "\${feign.openai.name}", url = "\${feign.openai.url}")
interface OpenAiFeignClient {
    @PostMapping("/v1/chat/completion")
    fun chat()
}