package com.example.training

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

        val config = RealmConfiguration.Builder().name("myuser1.realm").build()
        Realm.setDefaultConfiguration(config)
    }
}