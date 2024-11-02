package com.project.stock_analysis.infrastructure.database.model

import java.time.LocalDateTime

data class Stock(
    val id: Long,
    val name: String,
    val englishName: String,
    val standardCode: String,
    val listingDay: LocalDateTime,
    val market: String,
    val stockType: String,
    val sector: String,
    val country: String,
) {
}