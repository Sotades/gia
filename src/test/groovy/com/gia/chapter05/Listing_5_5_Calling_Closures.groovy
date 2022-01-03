package com.gia.chapter05

import spock.lang.Specification


class Listing_5_5_Calling_Closures extends Specification {

    def "Calling closures"() {
        given:
        def adder = {x, y -> return x + y}

        expect:
        adder(4,3) == 7

        and:

        adder.call(2,6) == 8


    }
}