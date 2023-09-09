package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterEkda(val requiredContext: Context, private val listOfEkda: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterEkda.HolderEkda>() {

    class HolderEkda(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvEkda: TextView = itemView.findViewById(R.id.tvEkda)
        val llParent: LinearLayout = itemView.findViewById(R.id.llParent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderEkda {
        return HolderEkda(
            LayoutInflater.from(requiredContext).inflate(R.layout.rcv_item_ekda, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listOfEkda.size
    }

    override fun onBindViewHolder(holder: HolderEkda, position: Int) {

        if (position % 2 == 0) {
            holder.llParent.setBackgroundColor(requiredContext.getColor(R.color.black))
            holder.tvEkda.setTextColor(requiredContext.getColor(R.color.white))
        } else {
            holder.llParent.setBackgroundColor(requiredContext.getColor(R.color.white))
        }

        holder.tvEkda.setText(listOfEkda.get(position).toString())

    }
}