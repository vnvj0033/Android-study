package com.example.mvctutorial.di.di_pre.ex1component

fun main() {
    val person = Student()
    DaggerStringComponent.create().injectString(person)
    println (person.name)
    println (person.address)
}
