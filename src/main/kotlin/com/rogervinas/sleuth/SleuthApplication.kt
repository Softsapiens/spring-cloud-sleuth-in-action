package com.rogervinas.sleuth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SleuthApplication

fun main(args: Array<String>) {
	runApplication<SleuthApplication>(*args)
}
