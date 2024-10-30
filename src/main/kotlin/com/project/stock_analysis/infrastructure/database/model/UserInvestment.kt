package com.project.stock_analysis.infrastructure.database.model

import com.project.stock_analysis.domain.recommendation.InvestmentPeriod

class UserInvestmentProfile(
    val id: Long,
    val userId: Long,
    val investmentRiskLevel: Int,
    val investmentSectorId: Long,
    val investmentPeriod: InvestmentPeriod,
) {
}