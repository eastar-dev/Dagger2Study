package dev.eastar.app.daggerstudy.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {
    @Provides
    @Singleton
    Object provideObject() {
        return new Object();
    }

}