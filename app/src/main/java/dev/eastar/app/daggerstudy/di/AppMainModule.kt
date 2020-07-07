package dev.eastar.app.daggerstudy.di

import dagger.Module
import dagger.Provides
import dev.eastar.app.daggerstudy.AppMain




/**
 * 2nd
 * 엑티비티 모듈은 스트링을 리턴하는 프로바이터를 재공하고
 * ActivityScope에서 라이프 사이클을 같이 하기 위한 어노테이션 ActivityScope을 추가 했습니다.
 *
 * 해당 액티비티 모듈은 AppMainFrModule을 사용할수 있게 하기위해
 * 해당 프로바이더를 재공해주는 AppMainFrComponent를 추가해서 서브 컴포넌트로 추가 해 주었구요
  *
 */

@Module(subcomponents = [AppMainFrComponent::class])
class AppMainModule {
    @Provides
    @ActivityScope
    fun provideActivityName(): String = AppMain::class.java.name
}
