package dev.eastar.app.daggerstudy.di;

import dagger.Component;

@Component(modules = MyModule.class)
public interface MyComponent {
    void inject(MyClass myClass);
}
