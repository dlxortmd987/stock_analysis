package com.project.stock_analysis.web.recommendation.dto.response

import com.project.stock_analysis.infrastructure.database.model.Stock

data class StockRecommendationGetResponse(
    val recommendedStocks: List<StockDetail>,
) {
    companion object {
        fun from(recommendStocks: List<Stock>): StockRecommendationGetResponse {

        }
    }

}

data class StockDetail(
    val name: String,
    val currentPrice: Double,
) {

}
