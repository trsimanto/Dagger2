package com.towhid.dagger.di

import com.towhid.dagger.Dagger
import com.towhid.dagger.di.module.ActivityBulderModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBulderModule::class
    ]
)
interface AppComponent : AndroidInjector<Dagger>