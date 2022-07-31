package com.example.disampleapp.screens.common.fragments

import androidx.fragment.app.Fragment
import com.example.disampleapp.common.composition.PresentationCompositionRoot
import com.example.disampleapp.screens.common.activities.BaseActivity

open class BaseFragment: Fragment() {

    protected val compositionRoot by lazy {
        PresentationCompositionRoot((requireActivity() as BaseActivity).activityCompositionRoot)
    }
}