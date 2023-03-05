plugins {
  id("dev.borsky.kotlin")
}

dependencies {
  api("com.aallam.openai:openai-client:${Versions.openai}")
  implementation("io.ktor:ktor-client-okhttp:${Versions.ktorClient}")
}
