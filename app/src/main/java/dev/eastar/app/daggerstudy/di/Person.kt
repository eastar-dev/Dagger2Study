package dev.eastar.app.daggerstudy.di

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject


@Component(modules = [PersonModule::class])
interface PersonComponent {
    fun getPersonA(): PersonA
    fun inject(personB: PersonB)
}

@Module
class PersonModule {
    @Provides
    fun proviceName(): String = "eastar"


    @Provides
    fun proviceAge(): Int = 10
}

data class PersonA @Inject constructor(
    var name: String
    , var age: Int
)

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

