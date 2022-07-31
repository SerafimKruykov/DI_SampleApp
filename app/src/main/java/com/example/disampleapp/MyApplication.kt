package com.example.disampleapp

import android.app.Application
import com.example.disampleapp.common.composition.AppCompositionRoot

class MyApplication: Application() {

    public lateinit var appCompositionRoot: AppCompositionRoot

    override fun onCreate() {
        appCompositionRoot = AppCompositionRoot(this)
        super.onCreate()
    }

}