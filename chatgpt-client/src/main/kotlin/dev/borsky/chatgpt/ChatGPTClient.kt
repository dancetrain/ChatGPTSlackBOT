package dev.borsky.chatgpt

import com.aallam.openai.client.OpenAI
import com.aallam.openai.client.OpenAIConfig

/**
 * @author Pavel Borsky
 */
class ChatGPTClient(
  config: OpenAIConfig
) {

  private val openai: OpenAI = OpenAI(config)


}
