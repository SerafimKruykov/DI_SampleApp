package com.example.disampleapp.networking

import com.google.gson.annotations.SerializedName
import com.example.disampleapp.questions.QuestionWithBody

data class SingleQuestionResponseSchema(@SerializedName("items") val questions: List<QuestionWithBody>) {
    val question: QuestionWithBody get() = questions[0]
}