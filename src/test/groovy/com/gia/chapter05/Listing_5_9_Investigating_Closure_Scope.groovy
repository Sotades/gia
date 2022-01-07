package com.gia.chapter05

import spock.lang.Specification

class Listing_5_9_Investigating_Closure_Scope extends Specification{
    def "Investigating Closure Scope"() {
        given:
        Mother julia = new Mother()
        Father dave = new Father()

        def closure = julia.birth('param')
        closure.setDelegate(dave)

        when: "I call the context"
        def context = closure.call()

        then: "First parameter 'this' is the object that birthed the closure"
        context[0] == julia

        and: "context[1] is the value 'prop' passed into the second element"
        context[1] == 'prop'

        and: "methods can be passed in. They will be evaluated and the return value passed back"
        context[2] == 'Result'

        and: "bound variable from within the closure 'birth' scope of Mother"
        context[3] == 'local'

        and: "bound variable from the parameter passed to the closure"
        context[4] == 'param'

        and: "we ask what the closure is using as the 'this' object"
        closure.thisObject == julia

        and: "we ask who the owner of the closure is (not always the same as 'this')"
        closure.owner == julia

        and: "delegate is the same as owner by default, but can be changed"
        closure.delegate == dave

        and: "we can specify how to resolve references and, in case of conflicts; default is owner first https://bit.ly/3F5cAFN"
        closure.resolveStrategy == Closure.OWNER_FIRST











    }
}
