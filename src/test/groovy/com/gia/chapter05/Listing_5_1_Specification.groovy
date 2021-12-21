package com.gia.chapter05

import spock.lang.Specification

class Listing_5_1_Specification extends Specification{
    def "Simple abbreviated closure declaration"() {
        given:
        def log = ''

        when: "I  use an explicitly declared parameter"
        (1..10).each{counter -> log += counter }

        then:
        log == '12345678910'

        and:

        when: "I use an implicitly declared parameter"
        log = ''
        (1..10).each{ log += it }

        then:
        log == '12345678910'

    }
}
