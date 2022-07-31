package com.example.disampleapp.networking

import com.example.disampleapp.questions.Question
import com.google.gson.annotations.SerializedName


class QuestionsListResponseSchema(@SerializedName("items") val questions: List<Question>)