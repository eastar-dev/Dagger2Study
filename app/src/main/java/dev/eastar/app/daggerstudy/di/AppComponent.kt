package dev.eastar.app.daggerstudy.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dev.eastar.app.daggerstudy.ui.login.AppApplication

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: AppApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application, appModule: AppModule): AppComponent
    }
}