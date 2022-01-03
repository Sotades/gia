package com.gia.chapter05

import spock.lang.Specification


class Listing_5_6_Calling_Closures extends Specification {

    def benchmark(int repeat, Closure worker){
        def start = System.nanoTime()

        repeat.times { worker(it)}

        def stop = System.nanoTime()
        return stop - start
    }

    def "Calling closures"() {
        given: "Pass different closures for analysis"
        def slow = benchmark(10000){(int) it/2}
        def fast = benchmark(10000){it.intdiv(2)}

        expect: "fast at least twice as fast as slow"
        fast * 2 < slow
    }
}