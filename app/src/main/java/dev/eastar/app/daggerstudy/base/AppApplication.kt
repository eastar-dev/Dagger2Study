package dev.eastar.app.daggerstudy.base

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import dev.eastar.app.daggerstudy.di.AppComponent
import dev.eastar.app.daggerstudy.di.AppModule
import dev.eastar.app.daggerstudy.di.DaggerAppComponent
import dev.eastar.app.daggerstudy.ui.login.Login
import kotlinx.android.synthetic.main.app_main.*


class AppApplication : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        //빌드 후 작성
        appComponent = DaggerAppComponent.factory().create(this, AppModule())
    }
}