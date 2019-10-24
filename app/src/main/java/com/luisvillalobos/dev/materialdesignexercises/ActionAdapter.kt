package com.luisvillalobos.dev.materialdesignexercises

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.item_action.view.*

class ActionAdapter(private val actionList: ArrayList<Action>, val listener: (Action) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_action,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return actionList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(actionList[position], listener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(action: Action, listener: (Action) -> Unit) {
            val button: MaterialButton = itemView.findViewById(R.id.btn_action)
            button.btn_action.text = action.name
            button.setOnClickListener { listener(action) }
        }
    }
}