package dev.eastar.app.daggerstudy.di

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

//이건 스콥을 정의 하기 위해 만들어야 한다.
//원래있는것이 아니기 때문에 만들어야 한다.
@Scope
@Retention(RetentionPolicy.SOURCE)
annotation class ActivityScope
