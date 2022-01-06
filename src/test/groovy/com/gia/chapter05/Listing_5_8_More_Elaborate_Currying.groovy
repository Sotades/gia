package com.gia.chapter05

import spock.lang.Specification


class Listing_5_8_More_Elaborate_Currying extends Specification {
    def "More elaborate currying"() {
        given: "closures"

        def configurator = { format, filter, line -> filter(line) ? format(line) : null }

        def appender = { config, append, line ->
            def out = config(line)
            if (out) append(out)
        }

        def dateFormatter = { line -> "${new Date()}: $line" }
        def debugFilter = { line -> line.contains('debug') }
        def consoleAppender = { line -> println(line) }

        when: "I curry the closures"

            def myConf = configurator.curry(dateFormatter, debugFilter)
            def myLog = appender.curry(myConf, consoleAppender)

        myLog('here is some message')
        myLog('this will be printed')


        then:

        1 == 1



    }
}
