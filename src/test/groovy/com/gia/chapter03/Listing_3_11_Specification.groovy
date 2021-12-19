package com.gia.chapter03

import spock.lang.Specification

class Listing_3_11_Specification extends Specification{
    def "GDK methods on numbers"() {
        given: "I have a number"
        def store = ''
        def n = 10

        when: "I apply the 'times' operator to a variable"
        n.times{ store += 'x'}

        then: "I get the closure executed by n times"
        store == 'xxxxxxxxxx'

        when: "I apply the 'times operator to a number"
        10.times{ store += 'y'}

        then: "I get the closure executed by number times"
        store == 'xxxxxxxxxxyyyyyyyyyy'
    }

    def "Walking up with loop variable"() {

        given:
        def store = ''

        when: "I use upto"
        1.upto(5) {number -> store += number}

        then: "I have a loop variable to work with"
        store == '12345'


    }

    def "I think I also have a loop counter in 'times' "(){
        given:
        def store = ''

        when: "I use 'times'"
        10.times{it -> store += it}

        then: "I had a loop variable to work with"
        store == '0123456789'
    }

    def "Arse around with a range object"() {

        given: "a string object"
        def store = ''
        when: "I use .each on a range"
        (1..5).each {element -> store += element }
        then: "I expect a closure with a variable that I can use"
        store == '12345'
    }
}
