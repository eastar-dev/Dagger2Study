package dev.eastar.app.daggerstudy.di;

import dagger.Component;

@Component(modules = {MyModuleA.class})
public interface MyComponent {
    void inject(MyClass myClass);
}
