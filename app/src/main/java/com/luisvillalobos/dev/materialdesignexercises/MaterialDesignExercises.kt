package com.luisvillalobos.dev.materialdesignexercises

import android.app.Application
import timber.log.Timber

class MaterialDesignExercises : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }
}