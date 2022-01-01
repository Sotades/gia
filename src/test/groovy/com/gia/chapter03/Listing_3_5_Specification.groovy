package com.gia.chapter03

import spock.lang.Ignore
import spock.lang.Specification

class Listing_3_5_Specification extends Specification{
    @Ignore
    def "A miscellany of string operations"() {
        given:
        String greeting = 'Hello Groovy!'

        expect:
        greeting.startsWith('Hello')
        and:
        greeting.getAt(0) == 'H'
        and:
        greeting[0] == 'H'
        and:
        greeting.indexOf('Groovy') >= 0
        and:
        greeting.contains('Groovy')
        and:
        greeting[6..11] == 'Groovy'
    }

    @Ignore
    def "Implicit use of StringBuffer"() {
        given:
        def greeting = 'Hello'

        when: "I don't manipulate the String 'greeting'"

        then: "'greeting' is still a String"
        java.lang.String.isInstance(greeting)

        when: "I manipulate the String 'greeting'"
        greeting <<= ' Groovy'

        then: "'greeting' becomes a StringBuffer"
        java.lang.StringBuffer.isInstance(greeting)
    }
}
