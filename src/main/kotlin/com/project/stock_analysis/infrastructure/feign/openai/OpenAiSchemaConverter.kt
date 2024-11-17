package com.project.stock_analysis.infrastructure.feign.openai

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.jvmErasure

fun convert(kClass: KClass<*>): Map<String, Any> {
    val properties = kClass.memberProperties

    val schemaProperties = properties.associateBy { property ->
        val type = property.returnType.jvmErasure
        property.name to mapOf(
            "type" to getJsonType(type),
            "items" to if (type == List::class) getJsonType(getListElementType(property.returnType)) else null
        ).filterValues { it != null }
    }

    return mapOf(
        "type" to "object",
        "properties" to schemaProperties,
        "required" to properties.filter { it.returnType.isMarkedNullable.not() }.map { it.name }
    )
}

private fun getJsonType(type: KClass<*>?): String {
    return when (type) {
        String::class -> "string"
        Int::class, Long::class, Short::class -> "integer"
        Float::class, Double::class -> "number"
        Boolean::class -> "boolean"
        List::class -> "array"
        Map::class -> "object"
        else -> "object" // 사용자 정의 클래스
    }
}

private fun getListElementType(type: kotlin.reflect.KType): KClass<*>? {
    return type.arguments.firstOrNull()?.type?.jvmErasure
}