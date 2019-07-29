package com.luisvillalobos.dev.materialdesignexercises

import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frame_animation.*

class FrameAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_animation)

        startAnimation.setOnClickListener{

            image.setBackgroundResource(R.drawable.frames)
            var animationDrawable : AnimationDrawable = image.background as AnimationDrawable

            if(animationDrawable.isRunning){
                animationDrawable.stop()
            }else{
                animationDrawable.stop()
                animationDrawable.start()
            }
        }
    }
}
