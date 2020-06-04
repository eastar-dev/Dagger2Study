package dev.eastar.app.daggerstudy.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class DuplicationModule {

    @Provides
    @Named("first")
    String provideFirstName() {
        return "eastar";
    }

    @Provides
    @Named("last")
    String provideLastName() {
        return "jeong";
    }
}
