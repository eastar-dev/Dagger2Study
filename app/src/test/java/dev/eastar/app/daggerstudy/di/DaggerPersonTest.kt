package dev.eastar.app.daggerstudy.di;

import org.junit.Test

class DaggerPersonTest {
    @Test
    fun testInjection() {
        run {
            val personComponent = DaggerPersonComponent.create().getPersonA()
            println(personComponent)
            println(personComponent)
        }
        println("=".repeat(30))
        run {
            val personComponent = DaggerPersonComponent.create().getPersonC()
            println(personComponent)
            println(personComponent)
        }
        println("=".repeat(30))
        run {
            val personComponent = DaggerPersonComponent.create().getPersonD()
            println(personComponent)
            println(personComponent)
        }
    }
}