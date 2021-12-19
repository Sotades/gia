package com.gia.chapter03

import groovy.transform.Immutable
import spock.lang.Specification

class Listing_3_3_Specification extends Specification{
    def "Overriding the plus and equals operators"() {
        given: "I Override the '+' and '==' operator"

        when: "I create a buck"
        Money buck = new Money(1, 'USD')

        then: "I expect to use '==' to compare to one Dollar"
        buck == new Money(1, 'USD')

        and: "I expect to be able to use '+' to add two instances of Money together"
        buck + buck == new Money(2, 'USD')

    }
}
