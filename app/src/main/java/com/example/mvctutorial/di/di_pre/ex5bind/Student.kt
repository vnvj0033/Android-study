package com.example.mvctutorial.di.di_pre.ex5bind

import javax.inject.Inject

class Student @Inject constructor() : Person {
    @Inject
    lateinit var name: String

    override fun getPersonName() = name
}
