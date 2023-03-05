package dev.borsky.slackbot.chatgpt

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * @author Pavel Borsky
 */
@ConfigurationProperties("openai")
data class ChatGPTProperties(
  val token: String,
  val organization: String? = null
)
