package dev.eastar.app.daggerstudy.di

import dagger.BindsInstance
import dagger.Subcomponent
import dev.eastar.app.daggerstudy.AppMain

/**
 * 플레그먼트를  위한 컴포넌트는 서브 컴포넌트로 구성해야 하므로 서브 컴포넌트의 클래
스를 애플리케이션 모듈의 멤버로 추가했다. 서브 컴포넌트와 서브 컴포넌트의 빌더
가 정의되었다면, 컴포넌트에서는 서브 컴포넌트의 빌더를 반환하는 프로비전 메서드 를 가질수 있다고 하는데 잘 모르겠음
 */
@Subcomponent(modules = [AppMainModule::class])
@ActivityScope
interface AppMainComponent {
    fun appMainFrComponentBuilder(): AppMainFrComponent.Builder
    fun inject(appMain: AppMain)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(appMain: AppMainModule): Builder

        @BindsInstance
        fun setAppMain(appMain: AppMain): Builder

        fun build(): AppMainComponent
    }
}
