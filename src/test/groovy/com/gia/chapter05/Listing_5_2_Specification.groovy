package com.gia.chapter05

import spock.lang.Specification

class Listing_5_2_Specification extends Specification {
    def "Simple method closures in action"() {
        given: "Some instantiated objects"
        SizeFilter filter6 = new SizeFilter(limit:6)
        SizeFilter filter5 = new SizeFilter(limit:5)

        def words = ['long string', 'medium', 'short', 'tiny']

        when: "assigning an instanciated instance method to a closure"
        Closure sizeUpTo6 = filter6.&sizeUpTo

        then: "the method can be called as a closure"
        'medium' == words.find(sizeUpTo6)
        'short' == words.find(filter5.&sizeUpTo)
    }
}
