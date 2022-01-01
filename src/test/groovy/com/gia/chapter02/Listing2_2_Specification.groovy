package com.gia.chapter02

import spock.lang.Ignore
import spock.lang.Specification

class Listing2_2_Specification extends Specification {
    @Ignore
    def "A simple Book Class"() {
        given: "A Book class"
        def book = new Book("Rebel without a Name")

        when: "I access its methods"

        then: "I don't need to use its getters and setters"
        book.title == "Rebel without a Name"

    }
}
