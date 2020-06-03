package dev.eastar.app.daggerstudy.di;

import dagger.Component;
import dagger.MembersInjector;

@Component(modules = {MyModuleA.class})
public interface MyComponent {
    void inject(MyClass myClass);

    MembersInjector<MyClass> getInjector();
}
