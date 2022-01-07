package com.gia.chapter05

class Mother {
    def prop = 'prop'
    def method(){
        return 'Result'
    }

    Closure birth(param){
        def local = 'local'
        def closure = { -> return [this, prop, method(), local, param]}
        return closure
    }
}
