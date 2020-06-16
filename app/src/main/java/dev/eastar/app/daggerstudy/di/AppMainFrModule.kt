package dev.eastar.app.daggerstudy.di

import dagger.Module
import dagger.Provides
import javax.inject.Named
import kotlin.random.Random

@Module
class AppMainFrModule {

//    @Named("fragment")
    @Provides
    @FragmentScope
    fun providerInt() : Int = Random(System.currentTimeMillis()).nextInt()
}
