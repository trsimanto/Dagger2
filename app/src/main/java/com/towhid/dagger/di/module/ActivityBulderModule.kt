package com.towhid.dagger.di.module

import com.towhid.dagger.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBulderModule {

    //activity Inject
    @ContributesAndroidInjector
    abstract fun bindMainActivity():MainActivity



}