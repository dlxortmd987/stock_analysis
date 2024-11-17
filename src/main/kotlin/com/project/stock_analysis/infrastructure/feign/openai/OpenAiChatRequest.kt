package com.project.stock_analysis.infrastructure.feign.openai

import com.fasterxml.jackson.annotation.JsonProperty
import com.project.stock_analysis.domain.recommendation.model.RecommendedStock
import com.project.stock_analysis.domain.recommendation.model.StockRecommendQuery

data class OpenAiChatRequest(
    val messages: List<RequestMessages>,
    val model: String,
    @JsonProperty("response_format") val responseFormat: OpenAiChatResponseFormat,
) {
    companion object {
        fun defaultFrom(query: StockRecommendQuery): OpenAiChatRequest {
            val schema = convert(RecommendedStock::class)
            return OpenAiChatRequest(
                listOf(),
                "gpt-4o-mini",
                OpenAiChatResponseFormat("object", OpenAiChatResponseSchema(schema, true)),
            )
        }
    }
}

data class RequestMessages(
    val role: String,
    val content: String,
)

data class OpenAiChatResponseFormat(
    val type: String,
    @JsonProperty("response_format") val jsonSchema: OpenAiChatResponseSchema,
)

data class OpenAiChatResponseSchema(
    @JsonProperty("json_schema") val jsonSchema: Map<String, Any>,
    val strict: Boolean,
)