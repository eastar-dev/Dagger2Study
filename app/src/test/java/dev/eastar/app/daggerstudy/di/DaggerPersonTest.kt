package dev.eastar.app.daggerstudy.di;

import junit.framework.Assert.assertSame
import org.junit.Test

class DaggerPersonTest {
    @Test
    fun testInjection() {
        val getPersonA1 = DaggerPersonComponent.create().getPersonA()
        println("$getPersonA1")
        val getPersonA2 = DaggerPersonComponent.create().getPersonA()
        println("$getPersonA2")
        assertSame(getPersonA1, getPersonA2)
    }
}