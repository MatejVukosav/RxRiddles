package com.vanniktech.rxriddles

import io.reactivex.Observable
import io.reactivex.functions.BiFunction

object Riddle5 {
    /**
     * Sum up the latest values of [first] and [second] whenever one of the Observables emits a new value.
     *
     * Use case: Two input fields in a calculator that need to be summed up and the result should be updated every time one of the inputs change.
     */
    fun solve(first: Observable<Int>, second: Observable<Int>): Observable<Int> {
        //combineLatest simply combines multiple sources and emits any time there’s a new value from any of them.
        //combineLatest calculates with latest whenever single source changes
        return Observable.combineLatest(first, second, BiFunction { t1, t2 -> t1 + t2 })
        //zip calculates only with new fresh pair values from both sources
        //return Observable.zip(first, second, BiFunction { t1, t2 -> t1 + t2 })
    }
}
