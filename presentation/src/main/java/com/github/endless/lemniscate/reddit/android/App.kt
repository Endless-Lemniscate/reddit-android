package com.github.endless.lemniscate.reddit.android

import android.app.Application
import com.github.endless.lemniscate.reddit.android.di.ApplicationComponent
import com.github.endless.lemniscate.reddit.android.di.DaggerApplicationComponent
import com.github.endless.lemniscate.reddit.android.di.modules.ContextModule

class App: Application() {
    companion object {
        lateinit var applicationComponent: ApplicationComponent
            private set
    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()
    }

}