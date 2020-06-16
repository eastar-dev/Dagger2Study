package dev.eastar.app.daggerstudy.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun proficeSharedPreferences(app: Application): SharedPreferences = app.getSharedPreferences("default", Context.MODE_PRIVATE)
}