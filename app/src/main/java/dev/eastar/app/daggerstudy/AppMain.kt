package dev.eastar.app.daggerstudy

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import dev.eastar.app.daggerstudy.base.AppApplication
import dev.eastar.app.daggerstudy.di.AppMainComponent
import dev.eastar.app.daggerstudy.di.AppMainModule
import kotlinx.android.synthetic.main.app_main.*
import javax.inject.Inject


class AppMain : AppCompatActivity() {
    @Inject
    lateinit var sharedPreference: SharedPreferences

    @Inject
    lateinit var activityName: String

    val appComponent: AppMainComponent by lazy {
        (application as AppApplication).appComponent
            .appMainComponentBuilder()
            .setModule(AppMainModule())
            .setAppMain(this) //주입받음
            .build().also { it.inject(this) }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_main)
        setSupportActionBar(toolbar)
        toolbar_layout.title = title
        fab.setOnClickListener { view ->
            Snackbar.make(view, "$activityName", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}