package com.example.disampleapp.screens.common.fragments

import androidx.fragment.app.Fragment
import com.example.disampleapp.dependencyInjection.presentation.DaggerPresentationComponent
import com.example.disampleapp.dependencyInjection.presentation.PresentationModule
import com.example.disampleapp.screens.common.activities.BaseActivity

open class BaseFragment: Fragment() {

    private val presentationComponent by lazy {
        DaggerPresentationComponent.builder()
            .presentationModule(PresentationModule((requireActivity() as BaseActivity).activityComponent))
            .build()
    }

    protected val injector get() = presentationComponent
}