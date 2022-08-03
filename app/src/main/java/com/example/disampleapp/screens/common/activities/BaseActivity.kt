package com.example.disampleapp.screens.common.activities

import androidx.appcompat.app.AppCompatActivity
import com.example.disampleapp.MyApplication
import com.example.disampleapp.dependencyInjection.activity.ActivityModule
import com.example.disampleapp.dependencyInjection.presentation.PresentationModule


import com.example.disampleapp.dependencyInjection.activity.DaggerActivityComponent
import com.example.disampleapp.dependencyInjection.presentation.DaggerPresentationComponent

open class BaseActivity: AppCompatActivity() {

    private val appComponent get() = (application as MyApplication).appComponent

    val activityComponent by lazy {
        DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this, appComponent))
            .build()
    }

    private val presentationComponent by lazy {
        DaggerPresentationComponent.builder()
            .presentationModule(PresentationModule(activityComponent))
            .build()
    }

    protected val injector get() = presentationComponent
}