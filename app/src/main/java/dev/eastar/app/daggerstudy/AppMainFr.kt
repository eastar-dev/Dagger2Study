package dev.eastar.app.daggerstudy

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.eastar.app.daggerstudy.di.AppMainFrModule
import javax.inject.Inject
import javax.inject.Singleton

class AppMainFr : Fragment() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName: String

    @Inject
    @JvmField
    var randomInt: Int = 0


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (activity is AppMain) {
            (activity as AppMain).appComponent
                .appMainFrComponentBuilder()
                .setModule(AppMainFrModule())
                .setAppMainFr(this)
                .build()
                .inject(this)

            //이부분이 계속 만들어야 하는 보일러 플레이트 코드를 없에게 위해서
            //DaggerFragement를 사용해야 하는데 상속을 받아야 해서 재약이 있다.
        }

        Log.e(this.javaClass.simpleName, activityName)
        Log.e(this.javaClass.simpleName, "" + randomInt)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.content_scrolling, container, false)
    }
}
