package com.project.stock_analysis.infrastructure.feign.feign

import com.project.stock_analysis.infrastructure.feign.openai.OpenAiChatRequest
import com.project.stock_analysis.infrastructure.feign.openai.OpenAiFeignClient
import com.project.stock_analysis.infrastructure.feign.openai.RequestMessages
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class OpenFeignClientTest {
    @Autowired
    private val feignClient: OpenAiFeignClient? = null

    @Value("\${API_KEY}")
    private lateinit var key: String

    @Test
    fun `openAI Chat API를 호출한다`() {

        val chat = feignClient?.chat(
            "Bearer $key",
            OpenAiChatRequest(
                listOf(RequestMessages("user", "주식추천해줘")),
                "gpt-4o"
            )
        )

        println("chat = $chat")
    }
}