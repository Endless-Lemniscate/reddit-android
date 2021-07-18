package com.github.endless.lemniscate.reddit.android.di

import com.github.endless.lemniscate.reddit.android.di.modules.ContextModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class])
interface ApplicationComponent {
}