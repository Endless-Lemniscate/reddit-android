package com.github.endless.lemniscate.reddit.android

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App: Application() {

    override fun onCreate() {
        super.onCreate()
        //Create debug functionality
        Timber.plant(Timber.DebugTree())
    }

}