package dev.eastar.app.daggerstudy.di;

import javax.inject.Inject;

public class MyClass {
    @Inject
    @FullName
    String str;

    public String getStr() {
        return str;
    }
}
