package com.luisvillalobos.dev.materialdesignexercises

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstAnimation.setOnClickListener {
            var intent = Intent(baseContext,FirstAnimation::class.java)
            startActivity(intent)
        }

        frameAnimation.setOnClickListener {
            var intent = Intent(baseContext,FrameAnimation::class.java)
            startActivity(intent)
        }

        activityAnimationRightLeft.setOnClickListener {
            var intent = Intent(baseContext,ActivityAnimationRightLeft::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.right_in,R.anim.left_out) // If you put 0 in output just trigger one animation
        }

        activityAnimationLeftRight.setOnClickListener {
            var intent = Intent(baseContext,ActivityAnimationLeftRight::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.left_in,R.anim.right_out) // If you put 0 in output just trigger one animation
        }

        activityAnimationTopDown.setOnClickListener {
            var intent = Intent(baseContext,ActivityAnimationTopBottom::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.top_in,R.anim.bottom_out) // If you put 0 in output just trigger one animation
        }

        activityAnimationDownTop.setOnClickListener {
            var intent = Intent(baseContext,ActivityAnimationBottomTop::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.bottom_in,R.anim.top_out) // If you put 0 in output just trigger one animation
        }
    }
}
