package com.vacuum.daggerexample

import android.app.Application
import com.vacuum.daggerexample.componant.DaggerObjectComponant
import com.vacuum.daggerexample.componant.ObjectComponant
import com.vacuum.daggerexample.module.ObjectModule

class App: Application() {
    companion object {
        lateinit var graph: ObjectComponant
        lateinit var Instance: App

    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    fun initializeDagger() {
        Instance =this
        graph = DaggerObjectComponant.builder()
                .objectModule(ObjectModule(this))
                .build()
    }

    fun getInstance():App{
        return Instance
    }

    fun getCompanion():ObjectComponant{
        return graph
    }
}