package com.luisvillalobos.dev.materialdesignexercises

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

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
