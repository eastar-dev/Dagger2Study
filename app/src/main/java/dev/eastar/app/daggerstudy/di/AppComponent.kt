package dev.eastar.app.daggerstudy.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dev.eastar.app.daggerstudy.base.AppApplication
import javax.inject.Singleton

/**
 * 5th 컴포넌트작성으로 들어가서
 * AppApplication은 안드로이드 에서생성하기 때문에 바이더를 이용해서 inject 해서
 * AppApplication안에 있는 sharedPreferences와 activity 에 있는 sharedPreferences 가 같이 주입이 됩니다.
 * 샘플에서는 AppApplication안에는 없지만 그냥 궁금해서 넣었어요
 */
@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun appMainComponentBuilder(): AppMainComponent.Builder
    fun inject(app: AppApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application, appModule: AppModule): AppComponent
    }
}







































/**
* 나중
* 액티비티를 위한 컴포넌트는 서브 컴포넌트로 구성해야 하므로 서브 컴포넌트의 클래
스를 애플리케이션 모듈의 멤버로 추가했다. 서브 컴포넌트와 서브 컴포넌트의 빌더
가 정의되었다면, 컴포넌트에서는 서브 컴포넌트의 빌더를 반환하는 프로비전 메서드 를 가질수 있다고 하는데 잘 모르겠음
*/
