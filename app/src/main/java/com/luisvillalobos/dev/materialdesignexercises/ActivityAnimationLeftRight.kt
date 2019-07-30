package com.luisvillalobos.dev.materialdesignexercises

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityAnimationLeftRight : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_left_right)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.right_in,R.anim.left_out)
    }
}
