package com.luisvillalobos.dev.materialdesignexercises

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_first_animation.*

class FirstAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_animation)

        startAnimation.setOnClickListener {
            //Make bigger the view
            //var animation = AnimationUtils.loadAnimation(this, R.anim.big)

            //Make invisible the view
            var animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
//            animation.fillAfter = true // Still the size after animate

//            animation.repeatMode = Animation.INFINITE
//            animation.repeatCount = Animation.INFINITE

            image.startAnimation(animation)
        }
    }
}
