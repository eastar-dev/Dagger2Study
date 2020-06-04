package dev.eastar.app.daggerstudy.di

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
@Component(modules = [PersonModule::class])
interface PersonComponent {
    fun getPersonA(): PersonA
}

@Module
class PersonModule {
    @Provides
    @Singleton
    fun provicePsrsonA(): PersonA {
        return PersonA()
    }
}

class PersonA {
    var name: String = "eastar"
    var age: Int = 10
}