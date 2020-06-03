package dev.eastar.app.daggerstudy.di

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject


@Component(modules = [FamilyModule::class])
interface FamilyComponent {
    fun inject(im: Im)
}

@Module
class FamilyModule {
    @Provides
    fun proviceName(): String = "::eastar::"
}

class Child : Im() {
    @Inject
    @JvmField
    var child_name: String = "::child_name::"
    override fun toString(): String = child_name + super.toString()
}

open class Im : Parent() {
    @Inject
    @JvmField
    var im_name: String = "::im_name::"
    override fun toString(): String = im_name + super.toString()
}

open class Parent {
    @Inject
    @JvmField
    var parent_name: String = "::parent_name::"
    override fun toString(): String = parent_name

}



