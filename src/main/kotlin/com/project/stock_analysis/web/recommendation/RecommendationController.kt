package com.project.stock_analysis.web.recommendation

//import com.project.stock_analysis.domain.recommendation.service.RecommendationService
import com.project.stock_analysis.domain.recommendation.model.StockRecommendQuery
import com.project.stock_analysis.domain.recommendation.service.RecommendationService
import com.project.stock_analysis.web.recommendation.dto.request.StockRecommendationGetRequest
import com.project.stock_analysis.web.recommendation.dto.response.StockRecommendationGetResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/recommend")
class RecommendationController(
    private val recommendationService: RecommendationService,
) {
    @GetMapping("/me")
    fun getRecommendedStocks(request: StockRecommendationGetRequest): StockRecommendationGetResponse {
        val recommendStocks = recommendationService.recommendStocks(request.toQuery())
        return StockRecommendationGetResponse.from(recommendStocks)
    }
}

private fun StockRecommendationGetRequest.toQuery(): StockRecommendQuery {
    return StockRecommendQuery(0)
}
