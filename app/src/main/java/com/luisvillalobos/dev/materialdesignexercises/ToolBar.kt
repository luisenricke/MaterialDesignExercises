package com.luisvillalobos.dev.materialdesignexercises

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tool_bar.*

class ToolBar : AppCompatActivity() {

    lateinit var toolbarWidget: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        toolbarWidget = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarWidget)
        /*
        supportActionBar?.title = "Titulo Ejemplo"
        toolbarWidget.subtitle = "Subtitulo"
        toolbarWidget.setLogo(R.drawable.ic_logo)
        toolbarWidget.setNavigationIcon(R.drawable.ic_nav)
        */
    }
}
