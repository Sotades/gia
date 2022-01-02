package com.gia.chapter05

import spock.lang.Specification


class Listing_5_4_Specification extends Specification {

    def doubleMethod(entry){
        entry.value = entry.value * 2
    }
    
    def "Full closure declaration examples"() {
        given:
        Map map = ['a':1, 'b':2]
        Closure doubler = {key, val -> map[key] = val * 2}


        when: "using an inline closure"
        map.each {key, value -> map[key] = value * 2 }

        then:
        map == ['a': 2, 'b':4]

        when: "using an explicitly created closure"
        map.each(doubler)

        then:
        map == ['a': 4, 'b':8]

        when: "Method is used as a method closure"
        doubler = this.&doubleMethod
        map.each(doubler)

        then:
        map == ['a': 8, 'b': 16]

    }
}