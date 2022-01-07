package com.gia.chapter05

class Father {
    def prop = 'prop'
    def method(){
        return 'Result2'
    }

    Closure birth(param){
        def local = 'local'
        def closure = { -> return [this, prop, method(), local, param]}
        return closure
    }
}
