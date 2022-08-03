package com.example.disampleapp.dependencyInjection.presentation

import com.example.disampleapp.screens.questionDetails.QuestionDetailsActivity
import com.example.disampleapp.screens.questionsList.QuestionsListFragment
import dagger.Component


@Component(modules = [PresentationModule::class])
interface PresentationComponent {

   fun inject(fragment: QuestionsListFragment)
   fun inject(activity: QuestionDetailsActivity)
}