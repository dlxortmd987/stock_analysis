package com.project.stock_analysis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockAnalysisApplication

fun main(args: Array<String>) {
    runApplication<StockAnalysisApplication>(*args)
}
