package com.example.disampleapp

import android.app.Application
import com.example.disampleapp.dependencyInjection.app.AppModule

import com.example.disampleapp.dependencyInjection.app.DaggerAppComponent

class MyApplication: Application() {

    val appComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
    }

}