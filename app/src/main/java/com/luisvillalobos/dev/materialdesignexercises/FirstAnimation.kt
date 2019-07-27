package com.luisvillalobos.dev.materialdesignexercises

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_first_animation.*

class FirstAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_animation)

        startAnimation.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(this,R.anim.big)
            image.startAnimation(animation)
        }
    }
}