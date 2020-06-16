package dev.eastar.app.daggerstudy.di

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@Scope
@Retention(RetentionPolicy.SOURCE)
annotation class ActivityScope
