package com.luisvillalobos.dev.materialdesignexercises

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

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
