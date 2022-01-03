package com.gia.chapter05

import spock.lang.Specification


class Listing_5_7_A_Simple_Currying_Example extends Specification {

    def "A simple currying example"() {
        given: "a closure with two input parameters"
        def mult = {x, y -> return x * y}

        when: "the closure is curried"
        def twoTimes = mult.curry(2)

        then: "the curried closure only has one parameter"
        twoTimes(5) == 10
    }
}