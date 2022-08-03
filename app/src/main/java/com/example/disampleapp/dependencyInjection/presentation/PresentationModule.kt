package com.example.disampleapp.dependencyInjection.presentation

import android.view.LayoutInflater
import androidx.fragment.app.FragmentManager
import com.example.disampleapp.dependencyInjection.activity.ActivityComponent
import com.example.disampleapp.networking.StackoverflowApi
import com.example.disampleapp.questions.FetchQuestionDetailsUseCase
import com.example.disampleapp.questions.FetchQuestionsUseCase
import com.example.disampleapp.screens.common.dialogs.DialogsNavigator
import com.example.disampleapp.screens.common.viewsmvc.ViewMvcFactory
import dagger.Module
import dagger.Provides

@Module
class PresentationModule(private val activityComponent: ActivityComponent) {

    @Provides
    fun layoutInflater() = activityComponent.layoutInflater()

    @Provides
    fun fragmentManager() = activityComponent.fragmentManager()

    @Provides
    fun stackoverflowApi() = activityComponent.stackoverflowApi()

    @Provides
    fun activity() = activityComponent.activity()

    @Provides
    fun screensNavigator() = activityComponent.screensNavigator()

    @Provides
    fun viewMvcFactory(layoutInflater: LayoutInflater) = ViewMvcFactory(layoutInflater)

    @Provides
    fun dialogsNavigator(fragmentManager: FragmentManager) = DialogsNavigator(fragmentManager)

    @Provides
    fun fetchQuestionsUseCase(stackoverflowApi: StackoverflowApi) = FetchQuestionsUseCase(stackoverflowApi)

    @Provides
    fun fetchQuestionDetailsUseCase(stackoverflowApi: StackoverflowApi) = FetchQuestionDetailsUseCase(stackoverflowApi)

}