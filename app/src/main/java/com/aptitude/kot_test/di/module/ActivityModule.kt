package com.aptitude.kot_test.di.module

import android.app.Activity
import com.aptitude.kot_test.ui.main.MainContract
import com.aptitude.kot_test.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}