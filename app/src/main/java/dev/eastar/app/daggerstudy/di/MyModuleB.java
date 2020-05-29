package dev.eastar.app.daggerstudy.di;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModuleB {

    @Provides
    int provideAge() {
        return 10;
    }
}
