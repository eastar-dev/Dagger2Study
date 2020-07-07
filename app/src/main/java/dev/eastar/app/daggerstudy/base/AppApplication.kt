package dev.eastar.app.daggerstudy.base

import android.app.Application
import android.content.SharedPreferences
import dagger.BindsInstance
import dev.eastar.app.daggerstudy.di.AppComponent
import dev.eastar.app.daggerstudy.di.AppModule
import dev.eastar.app.daggerstudy.di.DaggerAppComponent
import javax.inject.Inject


class AppApplication : Application() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        //빌드 후 작성
        //어노테이션 프로세서에 의해서 작성된 DaggerAppComponent를 이용해서
        //음....... 왜필요한지 모르겠다.
        //아마 appComponent의 저장 용도와 inject 인것같다.
        //@BindsInstance app: Application 에 의해서 application 은 주입이 되지만
        //을 왜 생성 해서 넣을까?
        appComponent = DaggerAppComponent.factory().create(this, AppModule())
        //이코드를 지나가면 sharedPreferences가 주입 됩니다.
    }
}