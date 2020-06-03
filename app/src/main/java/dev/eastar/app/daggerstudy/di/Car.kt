package dev.eastar.app.daggerstudy.di

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val car = Car()
        setSomeTire(car)
    }

    fun setSomeTire(car: Car) {
//        DaggerTireComponent
//            .builder()
//            .tireModule(TireModule)
//            .build()
//            .inject(car)

        println("${car.tire.getTireName()} is set to this car...")
    }


}

class Car {
    @Inject
    lateinit var tire: Tire
}

interface Tire {
    fun getTireName(): String
}


@Module
object TireModule {
    @Provides
    fun provideTire(text: String): Tire = when (text) {
        "nexen" -> NexenTire()
        else -> OtherTire()
    }
}

class NexenTire : Tire {
    override fun getTireName(): String = "Nexen Tire"
}

class OtherTire : Tire {
    override fun getTireName(): String = "Other Tire"
}


//@Component(modules = [TireModule::class])
//interface TireComponent {
////    fun getTire(text: String): Tire
//
//    fun inject(car: Car)
//
//    @Component.Builder
//    interface Builder {
//        fun build(): TireComponent
//        fun tireModule(tireModule: TireModule): Builder
//    }
//}