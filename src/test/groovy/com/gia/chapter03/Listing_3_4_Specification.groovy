package com.gia.chapter03

import spock.lang.Ignore
import spock.lang.Specification

import java.time.Year

class Listing_3_4_Specification extends Specification{
    @Ignore
    def "Working with GStrings"() {
        given:
        def me = 'Tarzan'
        def you = 'Jane'

        when: "I use placeholders"
        def line = "me $me - you $you"

        then:
        line == 'me Tarzan - you Jane'
    }

    @Ignore
    def "Using extended dot syntax"() {

        given: "defining a date and a map"
        TimeZone.default = TimeZone.getTimeZone('GMT')
        def date = new Date(0)
        def dateMap = [y:date[YEAR] - 1900, m:date[month], d:date[day]]

        when: "I format a string using dot syntax"
        def out = "Year $dateMap.y Month $dateMap.m Day $dateMap.d"

        then: out == 'Year 70 Month 0 Day 1'


    }
}
