package dev.eastar.app.daggerstudy.di

import dagger.BindsInstance
import dagger.Subcomponent
import dev.eastar.app.daggerstudy.AppMain
import dev.eastar.app.daggerstudy.AppMainFr

@FragmentScope
@Subcomponent(modules = [AppMainFrModule::class])
interface AppMainFrComponent {
    fun inject(appMainFr: AppMainFr)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(appMainFr: AppMainFrModule): Builder

        @BindsInstance
        fun setAppMainFr(appMain: AppMainFr): Builder

        fun build(): AppMainFrComponent
    }
}
