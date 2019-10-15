package io.pivotal.shinyay.component

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class SimpleAppStartupRunner: ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
    }
}