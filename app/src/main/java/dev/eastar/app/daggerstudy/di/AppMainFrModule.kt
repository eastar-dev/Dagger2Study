package dev.eastar.app.daggerstudy.di

import dagger.Module
import dagger.Provides
import kotlin.random.Random


/** 3nd
 * AppMainFrModule 모듈은 int형태를 리턴하는
 * 추가 할 컴포넌트는 없습니다.
 * 원래의 예제에서는 는 Provides 에서 Named 스코프를사용하였지만
 * 재공하는 헝태가 SharedPreferences ,String ,Int 로 모두 달라서
 * 지워도 잘작동합니다.
 *
 */
@Module
class AppMainFrModule {

    //    @Named("fragment")
    @Provides
    @FragmentScope
    fun providerInt(): Int = Random(System.currentTimeMillis()).nextInt()
}
