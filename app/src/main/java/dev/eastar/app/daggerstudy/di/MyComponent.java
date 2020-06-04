package dev.eastar.app.daggerstudy.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
    Object getObject();
}