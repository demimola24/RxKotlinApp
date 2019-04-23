package com.aptitude.kot_test.di.module

import android.app.Application
import com.aptitude.kot_test.BaseApp
import com.aptitude.kot_test.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}