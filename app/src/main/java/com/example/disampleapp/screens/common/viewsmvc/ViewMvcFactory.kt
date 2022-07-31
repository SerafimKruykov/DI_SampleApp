package com.example.disampleapp.screens.common.viewsmvc

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.disampleapp.screens.questionDetails.QuestionDetailsViewMvc
import com.example.disampleapp.screens.questionsList.QuestionsListViewMvc

class ViewMvcFactory(private val layoutInflater: LayoutInflater) {

    fun newQuestionsListViewMvc(parent: ViewGroup?): QuestionsListViewMvc {
        return QuestionsListViewMvc(layoutInflater, parent)
    }

    fun newQuestionDetailsViewMvc(parent: ViewGroup?): QuestionDetailsViewMvc {
        return QuestionDetailsViewMvc(layoutInflater, parent)
    }
}