package com.project.stock_analysis.domain.recommendation.model

import com.project.stock_analysis.infrastructure.database.model.Stock

data class RecommendedStock(
    val stock: Stock,
    val reason: String,
) {

}
