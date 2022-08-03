package com.example.disampleapp.dependencyInjection.app

import android.app.Application
import com.example.disampleapp.networking.StackoverflowApi
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun application(): Application
    fun stackoverflowApi(): StackoverflowApi

}