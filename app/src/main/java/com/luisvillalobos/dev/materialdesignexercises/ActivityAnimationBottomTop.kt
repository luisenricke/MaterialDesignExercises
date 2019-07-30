package com.luisvillalobos.dev.materialdesignexercises

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityAnimationBottomTop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_bottom_top)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.top_in,R.anim.bottom_out)
    }
}
