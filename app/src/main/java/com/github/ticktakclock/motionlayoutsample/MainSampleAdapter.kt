package com.github.ticktakclock.motionlayoutsample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MainSampleAdapter(private val dataset: Array<Sample>): RecyclerView.Adapter<MainSampleAdapter.ViewHolder>() {

    override fun getItemCount(): Int = dataset.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val row = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_list_row, parent, false) as ConstraintLayout
        return ViewHolder(row)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (dataset.size <= position) return
        val data = dataset[position]
        holder.title.text = data.title
        holder.description.text = data.description
    }

    class ViewHolder(layout: ConstraintLayout): RecyclerView.ViewHolder(layout) {
        var title = layout.findViewById<TextView>(R.id.main_row_title)
        var description = layout.findViewById<TextView>(R.id.main_row_description)

        init {
            layout.setOnClickListener {
                description.text = "クリック済み"
            }
        }
    }
}