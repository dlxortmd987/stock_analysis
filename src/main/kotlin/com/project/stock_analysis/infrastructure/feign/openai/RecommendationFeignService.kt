package com.project.stock_analysis.infrastructure.feign.openai

import com.project.stock_analysis.domain.recommendation.model.RecommendedStock
import com.project.stock_analysis.domain.recommendation.model.StockRecommendQuery
import com.project.stock_analysis.domain.recommendation.service.RecommendationService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class RecommendationFeignService(
    private val openAiFeignClient: OpenAiFeignClient,
    @Value("\${API_KEY}") private val apiKey: String
) : RecommendationService {
    override fun recommendStocks(query: StockRecommendQuery): List<RecommendedStock> {
        val chat = openAiFeignClient.chat(apiKey, OpenAiChatRequest.defaultFrom(query))
        return chat.toStocks()
    }

}

private fun OpenAiChatResponse.toStocks(): List<RecommendedStock> {

}
