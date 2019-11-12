package com.luisvillalobos.dev.materialdesignexercises

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.luisvillalobos.dev.materialdesignexercises.animation.*
import com.luisvillalobos.dev.materialdesignexercises.design.MenuActivity
import com.luisvillalobos.dev.materialdesignexercises.design.ToolBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // http://blogs.innovationm.com/mvp-for-android/
    // https://github.com/silmood/MVP-Top-York

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionList: ArrayList<Action> = arrayListOf(
            Action("First Animation", FirstAnimation::class.java),
            Action("Frame Animation", FrameAnimation::class.java),
            Action(
                "Animation right to left", ActivityAnimationRightLeft::class.java,
                R.anim.right_in, R.anim.left_out
            ),
            Action(
                "Animation left to right", ActivityAnimationLeftRight::class.java,
                R.anim.left_in, R.anim.right_out
            ),
            Action(
                "Animation top to down", ActivityAnimationTopBottom::class.java,
                R.anim.top_in, R.anim.bottom_out
            ),
            Action(
                "Animation top to down", ActivityAnimationBottomTop::class.java,
                R.anim.bottom_in, R.anim.top_out
            ),
            Action("Toolbar", ToolBar::class.java),
            Action("Menu", MenuActivity::class.java)
        )

        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ActionAdapter(actionList) { item: Action ->
            val intent = Intent(this, item.next)
            startActivity(intent)
            overridePendingTransition(item.inAnim, item.outAnim)
        }
    }
}
