package dev.eastar.app.daggerstudy.di;

import dagger.Module;
import dagger.Provides;

@Module(includes = MyModuleB.class)
public class MyModuleA {

    @Provides
    String provideName() {
        return "eastar";
    }
}
