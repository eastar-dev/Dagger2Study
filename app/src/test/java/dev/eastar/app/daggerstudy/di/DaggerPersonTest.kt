package dev.eastar.app.daggerstudy.di;

import org.junit.Test

class DaggerPersonTest {
    @Test
    fun testInjection() {
        val personComponent = DaggerPersonComponent.create().getPersonA()
        println(personComponent)


        val personB = PersonB()
        DaggerPersonComponent.create().inject(personB)
        println(personB)
    }
}