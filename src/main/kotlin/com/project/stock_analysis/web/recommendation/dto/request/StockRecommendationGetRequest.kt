package com.project.stock_analysis.web.recommendation.dto.request

data class StockRecommendationGetRequest(
    val userId: Long,
    val investmentRiskLevel: Int,
    val interestSector: UserInterestSector,
    val investmentPeriod: String,
) {

}

data class UserInterestSector(
    val name: String,
) {

}