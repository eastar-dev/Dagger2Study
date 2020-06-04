package dev.eastar.app.daggerstudy.di;

import javax.inject.Inject;
import javax.inject.Named;

public class MyClass {
    @Inject
    @Named("first")
    String str;

    public String getStr() {
        return str;
    }
}
