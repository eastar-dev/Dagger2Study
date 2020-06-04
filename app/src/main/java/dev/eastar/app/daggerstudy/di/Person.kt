package dev.eastar.app.daggerstudy.di

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Provider


@Component(modules = [PersonModule::class])
interface PersonComponent {
    fun getPersonA(): PersonA
    fun getPersonC(): PersonC
    fun getPersonD(): PersonD
    fun inject(personB: PersonB)
}

@Module
class PersonModule {
    @Provides
    fun proviceName(): String = "eastar"


    var age = 10

    @Provides
    fun proviceAge(): Int {
        println("proviceAge : $age")
        return age++
    }
}

data class PersonD @Inject constructor(
    var name: Provider<String>
    , var age: Provider<Int>
) {
    override fun toString(): String {
        println("toString : $age")
        return "${name.get()} ${age.get()}" + " " + super.toString()
    }
}

data class PersonC @Inject constructor(
    var name: String
    , var age: Int
) {
    override fun toString(): String {
        println("toString : $age")
        return "$name $age" + " " + super.toString()
    }
}

data class PersonA @Inject constructor(
    var name: dagger.Lazy<String>
    , var age: dagger.Lazy<Int>
) {
    override fun toString(): String {
        println("toString : $age")
        return name.get() + " " + age.get() + " " + super.toString()
    }
}

class PersonB {
    @Inject
    lateinit var name: String

    private var age: Int = 0

    @Inject
    fun setAge(age: Int) {
        this@PersonB.age = age
    }

    override fun toString(): String {
        return "$name  $age"
    }
}

