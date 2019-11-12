package com.luisvillalobos.dev.materialdesignexercises.design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luisvillalobos.dev.materialdesignexercises.R
import kotlinx.android.synthetic.main.activity_menu.*
import timber.log.Timber

class MenuActivity : AppCompatActivity(),
    MenuFragment.OnFragmentInteractionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        button.setOnClickListener {
            var list : ArrayList<Option> = arrayListOf(
                Option(
                    "Take picture",
                    R.drawable.ic_android_black_24dp
                ),
                Option(
                    "Select from gallery",
                    R.drawable.ic_android_black_24dp
                )
            )
            val menuFragment =
                MenuFragment.newInstance(
                    list
                )
            menuFragment.show(supportFragmentManager, "Menu")
        }
    }

    override fun onItemClickRecyclerView(item: Option) {
        when (item.name) {
            "Take picture" -> {
                Timber.i("Take picture")
            }
            "Select from gallery" -> {
                Timber.i("Select from gallery")
            }
        }
    }
}
