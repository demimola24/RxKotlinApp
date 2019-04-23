package com.aptitude.kot_test.di.component

import com.aptitude.kot_test.di.module.ActivityModule
import com.aptitude.kot_test.ui.main.MainActivity
import dagger.Component

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}