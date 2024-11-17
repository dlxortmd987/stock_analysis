package com.project.stock_analysis.domain.recommendation.service

import com.project.stock_analysis.domain.recommendation.model.RecommendedStock
import com.project.stock_analysis.domain.recommendation.model.StockRecommendQuery
import com.project.stock_analysis.infrastructure.database.model.Stock

interface RecommendationService {
    fun recommendStocks(query: StockRecommendQuery) : List<RecommendedStock>
}
