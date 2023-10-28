package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterColor(val reqContext:Context, val listOfColor:ArrayList<Int>):RecyclerView.Adapter<AdapterColor.HolderColor>() {

    class HolderColor(itemView:View):RecyclerView.ViewHolder(itemView){
        val crdColor:CardView=itemView.findViewById(R.id.crdColor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderColor {
        return HolderColor(LayoutInflater.from(reqContext).inflate(R.layout.item_color,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfColor.size
    }

    override fun onBindViewHolder(holder: HolderColor, position: Int) {
        holder.crdColor.setCardBackgroundColor(reqContext.getColor(listOfColor[position]))
    }
}