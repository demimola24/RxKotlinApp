package com.aptitude.kot_test.di.module

import com.aptitude.kot_test.api.ApiServiceInterface
import com.aptitude.kot_test.ui.about.AboutContract
import com.aptitude.kot_test.ui.about.AboutPresenter
import com.aptitude.kot_test.ui.list.ListContract
import com.aptitude.kot_test.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}