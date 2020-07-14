package com.towhid.dagger

import android.app.Application
import com.towhid.dagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class Dagger : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        DaggerAppComponent.create().inject(this)
        super.onCreate()

    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector
}