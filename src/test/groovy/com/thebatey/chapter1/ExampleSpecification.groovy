package com.thebatey.chapter1

import spock.lang.Specification

class ExampleSpecification extends Specification {
    def "should be a simple assertion"() {
        expect:
        1 == 1
    }
}
