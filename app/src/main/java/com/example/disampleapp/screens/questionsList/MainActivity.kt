package com.example.disampleapp.screens.questionsList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.disampleapp.screens.common.dialogs.ServerErrorDialogFragment

import com.example.disampleapp.Constants
import com.example.disampleapp.R
import com.example.disampleapp.networking.StackoverflowApi
import com.example.disampleapp.questions.Question
import com.example.disampleapp.screens.common.activities.BaseActivity
import kotlinx.coroutines.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_frame)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.frame_content, QuestionsListFragment())
                .commit()
        }

    }

}