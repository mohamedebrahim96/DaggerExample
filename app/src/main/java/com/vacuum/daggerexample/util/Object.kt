package com.vacuum.daggerexample.util

import android.content.SharedPreferences
import com.google.gson.Gson

class Object2(val sharedPreferences: SharedPreferences) {

    fun save(key:String, o: String){
        sharedPreferences.edit()
                .putString(key,o)
                .apply()
    }

    fun  get(key: String): String? {
        val json = sharedPreferences.getString(key, null)?: return null

        return json
    }
}