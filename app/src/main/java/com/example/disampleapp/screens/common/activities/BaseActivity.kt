package com.example.disampleapp.screens.common.activities

import androidx.appcompat.app.AppCompatActivity
import com.example.disampleapp.MyApplication
import com.example.disampleapp.common.composition.ActivityCompositionRoot
import com.example.disampleapp.common.composition.PresentationCompositionRoot

open class BaseActivity: AppCompatActivity() {

    private val appCompositionRoot get() = (application as MyApplication).appCompositionRoot

    val activityCompositionRoot by lazy {
        ActivityCompositionRoot(this, appCompositionRoot)
    }

    protected val compositionRoot by lazy {
        PresentationCompositionRoot(activityCompositionRoot)
    }
}