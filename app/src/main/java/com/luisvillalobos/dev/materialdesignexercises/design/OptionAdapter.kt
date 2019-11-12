package com.luisvillalobos.dev.materialdesignexercises.design

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView
import com.luisvillalobos.dev.materialdesignexercises.R

class OptionAdapter(private val list: ArrayList<Option>, private val listener: (Option) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_option,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(list[position], listener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(option: Option, listener: (Option) -> Unit) {
            val name: MaterialTextView = itemView.findViewById(R.id.lbl_option)
            val thumbnail: ImageView = itemView.findViewById(R.id.img_option)
            val itemClick: LinearLayout = itemView.findViewById(R.id.item_option)

            name.text = option.name
            thumbnail.setImageResource(option.resource)
            itemClick.setOnClickListener { listener(option) }
        }
    }
}