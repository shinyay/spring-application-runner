package io.pivotal.shinyay.component

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class SimpleAppStartupRunner: ApplicationRunner {
    val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    override fun run(args: ApplicationArguments?) {
        logger.info("Executing the command line runner, OptionNames: ${args?.optionNames.toString()}")
        logger.info("Executing the command line runner, OptionValues: ${args?.getOptionValues("param")?.get(0)}")
        logger.info("Executing the command line runner, SourceArgs: ${args?.sourceArgs?.contentToString()}")
    }
}