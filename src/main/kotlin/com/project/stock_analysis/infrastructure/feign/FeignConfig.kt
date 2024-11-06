package com.project.stock_analysis.infrastructure.feign

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients("com.project.stock_analysis.infrastructure.feign")
class FeignConfig {
}