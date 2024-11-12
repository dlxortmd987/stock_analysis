package com.project.stock_analysis.infrastructure.feign.openai

data class OpenAiChatRequest(
    val messages: List<RequestMessages>,
    val model: String,
) {
}

data class RequestMessages(
    val role: String,
    val content: String,
)