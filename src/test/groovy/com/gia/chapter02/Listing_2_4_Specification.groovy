package com.gia.chapter02

import spock.lang.Specification

class Listing_2_4_Specification extends Specification{
    def "A Bean demonstration"() {
        given: "A Bean"
        def bookBean = new BookBean()

        when: "I set the property 'title' without using getter or setter notation"
        bookBean.title = "Mr. Bean's Adventure"

        then: "the property should be set"
        bookBean.title == "Mr. Bean's Adventure"

    }
}
