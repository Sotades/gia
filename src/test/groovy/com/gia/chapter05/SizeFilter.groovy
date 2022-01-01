package com.gia.chapter05

class SizeFilter {
    Integer limit
    boolean sizeUpTo(String value){
        return value.size() <= limit
    }
}
