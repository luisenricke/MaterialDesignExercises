package com.luisvillalobos.dev.materialdesignexercises

import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_first_animation.*

class FirstAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_animation)


        image.visibility = View.INVISIBLE // To apply fade_in

        startAnimation.setOnClickListener {
            //Make bigger the view
            //var animation = AnimationUtils.loadAnimation(this, R.anim.big)

            //Make invisible the view
            //var animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)

            //Make visible the view
            var animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)

//            animation.fillAfter = true // Still the size after animate

//            animation.repeatMode = Animation.INFINITE
//            animation.repeatCount = Animation.INFINITE

            image.startAnimation(animation)
        }
    }
}
