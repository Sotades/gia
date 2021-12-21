package com.gia.chapter04

import spock.lang.Specification


class Listing_4_4_Specification extends Specification{
    def "Specifying lists"() {
        given:
        List myList = [1, 2, 3]
        List emptyList = []
        List longList = (0..1000).toList()
        List explicitList = new ArrayList()

        expect: "to be able to interrogate the list"
        myList.size() == 3
        myList[0]  == 1
        ArrayList.isInstance(myList)

        and:
        emptyList.size() == 0

        and:
        longList[555] == 555

        when: "I fill one list from another using the addAll() method"
        explicitList.addAll(myList)
        explicitList[0] = 10

        then:
        explicitList.size() == 3
        explicitList[0] == 10


        when: "I fill a list using a constructor"
        explicitList = new LinkedList(myList)
        explicitList[0] = 10

        then:
        explicitList.size() == 3
        explicitList[0] == 10
    }
}
