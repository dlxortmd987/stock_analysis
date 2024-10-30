package com.project.stock_analysis.infrastructure.database.model

data class RecommendedStock(
    val id: Long,
    val userId: Long,
    val stockId: String,
) {
}