package dev.borsky.slackbot

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @author Pavel Borsky
 */
@SpringBootApplication
class ChatGPTSlackBotApplication {
}


fun main(args: Array<String>) {
    val ctx = runApplication<ChatGPTSlackBotApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
    
    val lock = Object()
    Runtime.getRuntime().addShutdownHook(Thread {
        synchronized(lock) {
            lock.notifyAll()
        }
    })
    synchronized(lock) {
        lock.wait()
    }
}
