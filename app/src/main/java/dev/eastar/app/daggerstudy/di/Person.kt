package dev.eastar.app.daggerstudy.di

import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject


@Component(modules = [PersonModule::class])
interface PersonComponent {
    fun getPersonA(): PersonA

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setString(anotherName: String): Builder
        fun build(): PersonComponent
    }
}

@Module
class PersonModule {
//    @Provides
//    fun proviceName(): String = "eastar"


    @Provides
    fun proviceAge(): Int = 10
}

data class PersonA @Inject constructor(var name: String, var age: Int)

