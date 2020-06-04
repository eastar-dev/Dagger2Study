package dev.eastar.app.daggerstudy.di;

import junit.framework.Assert.assertSame
import org.junit.Test

class DaggerPersonTest {
    @Test
    fun testInjection() {
        with(DaggerPersonComponent.create()) {
            val getPersonA1 = getPersonA()
            println("$getPersonA1")
            val getPersonA2 = getPersonA()
            println("$getPersonA2")
            assertSame(getPersonA1, getPersonA2)
        }
    }
}