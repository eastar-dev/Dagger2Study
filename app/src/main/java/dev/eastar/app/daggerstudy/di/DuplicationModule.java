package dev.eastar.app.daggerstudy.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Named;
import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Module
public class DuplicationModule {

    @Provides
    @Named("first")
    String provideFirstName() {
        return "DuplicationModule::eastar";
    }

    @Provides
    @Named("last")
    String provideLastName() {
        return "DuplicationModule::jeong";
    }

    @Provides
    @FullName
    String provideName() {
        return "DuplicationModule::eastar jeong";
    }

}
