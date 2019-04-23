package com.aptitude.kot_test.di.component

import com.aptitude.kot_test.BaseApp
import com.aptitude.kot_test.di.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(application: BaseApp)

}