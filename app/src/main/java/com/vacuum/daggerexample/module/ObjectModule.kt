package com.vacuum.daggerexample.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.Gson
import com.vacuum.daggerexample.util.Object2
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ObjectModule(val mContext: Context){
    @Provides @Singleton
    fun ProvideContext():Context{
        return mContext
    }

    @Provides @Singleton
    fun ProvidesPrefrances():SharedPreferences{
        return PreferenceManager.getDefaultSharedPreferences(mContext)
    }

    @Singleton
    @Provides
    fun provideObjectManager(sharedPreferences: SharedPreferences): Object2 {
        return Object2(sharedPreferences)
    }


}