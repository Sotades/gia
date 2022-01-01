package com.gia.chapter03

import spock.lang.Ignore
import spock.lang.Specification

import java.awt.Point

class Listing_3_2_Specification extends Specification{
    @Ignore
    def "Casting lists and maps to arbitrary classes"() {
        given: "Some Points"
        Point topLeft = new Point(0,0)  //classic

        when: "I use List and Map cast by Groovy to create points"
        Point botRight = [100, 100]
        Point center = [x:50, y:50]

        then: "all points are instances of Point"
        Point.isInstance(topLeft)
        Point.isInstance(botRight)
        Point.isInstance(center)

    }
}
