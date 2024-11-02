package com.project.stock_analysis.infrastructure.database.model

data class Sector(
    val id: Int,
    val code: String,
    val name: String,
    val classTier: String,
    val description: String,
    val language: String,
) {
}