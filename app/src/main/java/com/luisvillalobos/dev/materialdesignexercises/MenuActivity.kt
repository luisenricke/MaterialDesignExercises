package com.luisvillalobos.dev.materialdesignexercises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity(), MenuFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        button.setOnClickListener {
            val menuFragment = MenuFragment.newInstance()
            menuFragment.show(supportFragmentManager, "Menu")
        }
    }
}
