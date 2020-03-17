package com.example.heroku

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    val port = System.getenv("PORT")?.toInt() ?: 23567
    embeddedServer(Netty, port) {
        routing {
            get("/") {
                call.respondText("My Example Blog", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}