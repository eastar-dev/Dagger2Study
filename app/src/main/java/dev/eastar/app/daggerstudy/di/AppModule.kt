package dev.eastar.app.daggerstudy.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [AppMainComponent::class])
class AppModule {
    @Singleton
    @Provides
    fun providerSharedPreferences(app: Application): SharedPreferences =
        app.getSharedPreferences("default", Context.MODE_PRIVATE)
}