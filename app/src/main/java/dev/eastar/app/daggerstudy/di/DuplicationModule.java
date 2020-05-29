package dev.eastar.app.daggerstudy.di;

import dagger.Module;
import dagger.Provides;

@Module
public class DuplicationModule {

    @Provides
    String provideFirstName() {
        return "eastar";
    }

    @Provides
    String provideLastName() {
        return "eastar";
    }
}
