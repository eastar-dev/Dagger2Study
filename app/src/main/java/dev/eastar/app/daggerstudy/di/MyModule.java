package dev.eastar.app.daggerstudy.di;

import javax.inject.Named;
import javax.inject.Singleton;

import androidx.annotation.Nullable;
import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {
    @Provides
    @Singleton
    Object provideObject(){
        return new Object();
    }

}