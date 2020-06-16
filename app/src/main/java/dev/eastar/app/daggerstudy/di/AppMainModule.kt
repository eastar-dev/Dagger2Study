package dev.eastar.app.daggerstudy.di

import dagger.Module
import dagger.Provides
import dev.eastar.app.daggerstudy.AppMain

@Module(subcomponents = [AppMainFrComponent::class])
class AppMainModule {
    @Provides
    @ActivityScope
    fun provideActivityName(): String = AppMain::javaClass.name
}
