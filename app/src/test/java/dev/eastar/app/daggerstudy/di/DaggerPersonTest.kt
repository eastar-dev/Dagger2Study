package dev.eastar.app.daggerstudy.di;

import org.junit.Test

class DaggerPersonTest {
    @Test
    fun testInjection() {
//        val personComponent = DaggerPersonComponent.create().getPersonA()
//        println(personComponent)

        val personComponent = DaggerPersonComponent.builder().setString("Kim").build().getPersonA()
        println(personComponent)


    }
}