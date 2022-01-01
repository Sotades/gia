package com.gia.chapter03

import spock.lang.Ignore
import spock.lang.Specification

class Listing_3_1_Specification extends Specification{
    @Ignore
    def "What looks like a primitive type, isn't"(){
        given: "A variable of type int is defined"
        int a = 1

        when: "it is inspected"

        then: "found to be an object"
        expect: java.lang.Integer.isInstance(a)
    }
    @Ignore
    def "Groovy supports primitive methods and object operators"() {

        expect: java.lang.String.isInstance((60 * 60 * 24 * 365).toString())
    }
    @Ignore
    def "Automatically converts primitive int to String"() {

        given: "a primitive int"
        int secondsPerYear = 60 * 60 * 24 * 365

        when: "it is cast to a String"
        secondsPerYear.toString()

        then: "no exception is raised"
        notThrown( Exception)

    }
}
