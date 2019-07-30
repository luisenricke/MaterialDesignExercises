package com.luisvillalobos.dev.materialdesignexercises

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityAnimationRightLeft : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_right_left)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.left_in,R.anim.right_out)
    }
}
