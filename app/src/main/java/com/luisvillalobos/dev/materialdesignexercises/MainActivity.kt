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
            var intent = Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
