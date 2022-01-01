package com.gia.chapter04

import spock.lang.Ignore
import spock.lang.Specification

class Listing_4_5_Specification extends Specification{
    @Ignore
    def "Accessing parts of a list with an overloaded subscript operator"() {
        given:
        def myList = ['a','b','c','d','e','f']

        expect: "I can use getAt(Range)"
        myList[0..2] == ['a','b','c']

        and: "I can use getAt(collection of Indexes)"
        myList[0,2,4] == ['a','c','e']

        when: "putAt(Range)"
        myList[0..2] = ['x','y','z']

        then:
        myList == ['x','y','z','d','e','f']

        when: "Removing elements"
        myList[3..5] = []

        then:
        myList == ['x','y','z']

        when: "Adding elements"
        myList[1..1] = [0,1,2]

        then:
        myList == ['x',0,1,2,'z']

        when: "Adding elements using putAt(Range)"
        myList[0..0] = [3,4,5]

        then: "Result is like this"
        myList == [3,4,5,0,1,2,'z']

        and: "not like this"
        myList != [[3,4,5],0,1,2,'z']

        when: "adding elements using putAt(index)"
        myList[0] = [3,4,5]

        then: "Result is like this"
        myList == [[3,4,5],4,5,0,1,2,'z']

    }
}
