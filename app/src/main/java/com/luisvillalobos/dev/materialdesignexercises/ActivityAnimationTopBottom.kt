package com.luisvillalobos.dev.materialdesignexercises

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityAnimationTopBottom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_top_bottom)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.bottom_in,R.anim.top_out)
    }
}
