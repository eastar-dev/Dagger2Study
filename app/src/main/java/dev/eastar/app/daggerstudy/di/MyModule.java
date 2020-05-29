package dev.eastar.app.daggerstudy.di;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    String provideName() {
        return "eastar";
    }
}
