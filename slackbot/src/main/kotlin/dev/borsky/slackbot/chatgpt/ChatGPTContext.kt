package dev.borsky.slackbot.chatgpt

import com.aallam.openai.client.OpenAIConfig
import dev.borsky.chatgpt.ChatGPTClient
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Pavel Borsky
 */
@Configuration
@EnableConfigurationProperties(ChatGPTProperties::class)
class ChatGPTContext {

  @Bean
  fun openAIConfig(props: ChatGPTProperties): OpenAIConfig {
    return OpenAIConfig(
      token = props.token,
      organization = props.organization
    )
  }

  @Bean
  fun chatGPTClient(config: OpenAIConfig): ChatGPTClient {
    return ChatGPTClient(config)
  }
}
