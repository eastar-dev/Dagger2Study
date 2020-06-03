package dev.eastar.app.daggerstudy.di;

import org.junit.Test
import javax.inject.Inject

class DaggerTest3 {
    @Test
    fun testInjection() {
        val child = Child()
        DaggerFamilyComponent.create().inject(child)
        println(child)
    }
}