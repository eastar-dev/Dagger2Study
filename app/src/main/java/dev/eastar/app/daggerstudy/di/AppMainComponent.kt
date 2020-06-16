package dev.eastar.app.daggerstudy.di

import dagger.BindsInstance
import dagger.Subcomponent
import dev.eastar.app.daggerstudy.AppMain

@Subcomponent(modules = [AppMainModule::class])
@ActivityScope
interface AppMainComponent {

    fun inject(appMain: AppMain)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(appMain: AppMainModule): Builder

        @BindsInstance
        fun setAppMain(appMain: AppMain): Builder

        fun build(): AppMainComponent
    }
}
