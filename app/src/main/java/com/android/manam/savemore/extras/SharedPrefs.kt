package com.android.manam.savemore.extras

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs (context: Context){
    val PREFS_FILE_NAME = "manam.savemore.prefs"
    val USER_FULL_NAME_KEY = "user_full_name_key"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILE_NAME, 0)

    var userFullName: String
        get() = prefs.getString(USER_FULL_NAME_KEY,"")
        set(value) = prefs.edit().putString(USER_FULL_NAME_KEY,value).apply()
}