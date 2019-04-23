package com.aptitude.kot_test.di.component

import com.aptitude.kot_test.di.module.FragmentModule
import com.aptitude.kot_test.ui.about.AboutFragment
import com.aptitude.kot_test.ui.list.ListFragment
import dagger.Component

@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {
    fun inject(aboutFragment: AboutFragment)
    fun inject(listFragment: ListFragment)

}