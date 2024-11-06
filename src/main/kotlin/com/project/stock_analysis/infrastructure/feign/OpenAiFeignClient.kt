package com.project.stock_analysis.infrastructure.feign

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(name = "${feign.openai.name}", url = "${feign.openai.url}")
interface OpenAiFeignClient {
}