package com.project.stock_analysis.infrastructure.feign.openai

import com.project.stock_analysis.domain.recommendation.model.RecommendedStock
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OpenAiSchemaConverterKtTest {

    @Test
    fun `클래스의 필드를 분석해서 Map 형태로 변환한다`() {
        val result = convert(RecommendedStock::class)

        println(result)
    }
}