package com.luisvillalobos.dev.materialdesignexercises.animation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.luisvillalobos.dev.materialdesignexercises.R

class ActivityAnimationTopBottom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_top_bottom)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(
            R.anim.bottom_in,
            R.anim.top_out
        )
    }
}
