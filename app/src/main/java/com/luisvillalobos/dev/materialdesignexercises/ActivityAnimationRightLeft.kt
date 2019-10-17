package com.luisvillalobos.dev.materialdesignexercises

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

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
