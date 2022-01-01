package com.gia.chapter02

import groovy.transform.Immutable
import spock.lang.Ignore
import spock.lang.Specification

class Listing_2_5_Specification extends Specification{
    @Ignore
    def "Defining an immutable FixedBean and exercising it"() {

        given: "An Immutable class is created"

        when: "I create two new classes"
        def gina = new FixedBook('Groovy in Action')
        def regina = new FixedBook(title: 'Groovy in Action')
        gina.title = 'Oops!'

        then: "They should be immutable"
        thrown(ReadOnlyPropertyException)
    }

    @Ignore
    def "Investigating what is in an unassigned array element"() {

        given:
        def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']

        when:
        roman[9] = 'IX'

        then:
        roman[8] == null
    }

    @Immutable class FixedBook{
        String title
    }
}
