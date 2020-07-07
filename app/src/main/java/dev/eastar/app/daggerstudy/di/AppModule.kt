package dev.eastar.app.daggerstudy.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * first
 * 엡 모듈을 작성하고 SharedPreferences 리턴하는ㄴ 프로바이더를 생성합니다.
 * 이 부분은 앱전체에서 싱크통으로 작동해야 하기 때문에 엡 모듈로 작성했구요
 * 앱 모듈을 사용가능한 부분에서는 AppMainModule 모듈을 사용할수 있게
 * 해당 바인더가 포함되어 있는 AppMainComponent를 추가했습니다.
 *
 */
@Module(subcomponents = [AppMainComponent::class])
class AppModule {
    @Singleton
    @Provides
    fun providerSharedPreferences(app: Application): SharedPreferences =
        app.getSharedPreferences("default", Context.MODE_PRIVATE)
}