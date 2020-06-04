package dev.eastar.app.daggerstudy.di;

import junit.framework.Assert.assertSame
import org.junit.Assert
import org.junit.Test

class DaggerPersonTest {
    @Test
    fun testInjection() {
        DaggerPersonComponent.create().run {
            val getPersonA1 = getPersonA()
            println("$getPersonA1")
            val getPersonA2 = getPersonA()
            println("$getPersonA2")
            assertSame(getPersonA1, getPersonA2)
        }

    }

    @Test
    fun testObjectIdentity() {
        val myComponent = DaggerMyComponent.create()
        val temp1 = myComponent.getObject()
        val temp2 = myComponent.getObject()
        println(temp1.hashCode())
        println(temp2.hashCode())
        println(temp1 === temp2)
        Assert.assertEquals(temp1, temp2)
    }
}