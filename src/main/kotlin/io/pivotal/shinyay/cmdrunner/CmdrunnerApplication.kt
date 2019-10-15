package io.pivotal.shinyay.cmdrunner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CmdrunnerApplication

fun main(args: Array<String>) {
	runApplication<CmdrunnerApplication>(*args)
}
