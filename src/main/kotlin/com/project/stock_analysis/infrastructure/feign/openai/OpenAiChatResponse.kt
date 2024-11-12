package com.project.stock_analysis.infrastructure.feign.openai

data class OpenAiChatResponse(
    val choices: List<ChatResponseChoice>,
)

data class ChatResponseChoice(
    val message: ChatResponseMessage,
)

data class ChatResponseMessage(
    val role: String,
    val content: String,
)