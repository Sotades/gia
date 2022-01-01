package com.gia.chapter04

import spock.lang.Ignore
import spock.lang.Specification

class Listing_4_6_Specification extends Specification{
    @Ignore
    def "List operators involved in adding and removing items"() {
        given:
        def myList = []

        when: 'I use the + operator'
        myList += 'a'

        then:
        myList == ['a']

        when: "I use the plus(object) operator"
        myList = myList.plus('a')

        then:
        myList == ['a', 'a']

        when: "I use the + operator to add a collection"
        myList += ['b', 'c']

        then:
        myList == ['a', 'a', 'b', 'c']

        when: "I use the plus(collection) method"
        myList = myList.plus(['d', 'e', 'f'])

        then:
        myList == ['a', 'a', 'b', 'c', 'd', 'e', 'f']

        when:"leftShift is like append"
        myList = []
        myList << 'a' << 'b'

        then:
        myList == ['a', 'b']

        when: "minus a collection using the '-' operator"
        myList = myList - ['b']

        then:
        myList == ['a']

        when: "Multiplying a collection"
        myList = ['a', 'b']
        myList = myList * 2

        then:
        myList == ['a', 'b', 'a', 'b']


    }
}
