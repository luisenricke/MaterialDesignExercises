package com.luisvillalobos.dev.materialdesignexercises

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tool_bar.*

class ToolBar : AppCompatActivity() {

    lateinit var toolbarWidget: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        toolbarWidget = findViewById<Toolbar>(R.id.toolbar)
        toolbarWidget.inflateMenu(R.menu.menu_main)
        toolbarWidget.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.search -> Toast.makeText(this,"Android",Toast.LENGTH_SHORT).show()
                R.id.android -> Toast.makeText(this,"Android",Toast.LENGTH_SHORT).show()
                R.id.settings -> Toast.makeText(this,"Settins",Toast.LENGTH_SHORT).show()
                R.id.edit -> Toast.makeText(this,"Edit",Toast.LENGTH_SHORT).show()
                R.id.exit -> Toast.makeText(this,"Exit",Toast.LENGTH_SHORT).show()
            }
            false
        }

        //setSupportActionBar(toolbarWidget) //With action bar
        /* Ptogrammaly
        supportActionBar?.title = "Titulo Ejemplo"
        toolbarWidget.subtitle = "Subtitulo"
        toolbarWidget.setLogo(R.drawable.ic_logo)
        toolbarWidget.setNavigationIcon(R.drawable.ic_nav)
        */
    }

/* With action bar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
 */

}
