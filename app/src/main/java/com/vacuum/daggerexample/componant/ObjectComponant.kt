package com.vacuum.daggerexample.componant

import com.vacuum.daggerexample.App
import com.vacuum.daggerexample.module.ObjectModule
import com.vacuum.daggerexample.ui.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ObjectModule::class])
interface ObjectComponant {
    fun inject(app: MainActivity)
}