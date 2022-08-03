package com.example.disampleapp.dependencyInjection.app

import android.app.Application
import androidx.annotation.UiThread
import com.example.disampleapp.Constants
import com.example.disampleapp.networking.StackoverflowApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@UiThread

@Module
class AppModule(val application: Application) {

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun application() = application

    @Provides
    @AppScope
    fun stackoverflowApi() = retrofit.create(StackoverflowApi::class.java)

}