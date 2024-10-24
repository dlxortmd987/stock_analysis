package com.project.stock_analysis.web.recommendation.dto.response

data class StockRecommendationGetResponse(
    val recommendedStocks: List<StockDetail>,
) {

}

data class StockDetail(
    val name: String,
    val currentPrice: Double,
) {

}
