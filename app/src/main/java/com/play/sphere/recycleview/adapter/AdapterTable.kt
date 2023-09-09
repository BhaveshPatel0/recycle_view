package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterTable(val reqContext:Context,val listOfTable:ArrayList<String>):RecyclerView.Adapter<AdapterTable.HolderTable>() {

    class HolderTable(itemView:View):RecyclerView.ViewHolder(itemView){

        val tvEkda:TextView=itemView.findViewById(R.id.tvEkda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderTable {
        return HolderTable(LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_ekda,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfTable.size
    }

    override fun onBindViewHolder(holder: HolderTable, position: Int) {
        holder.tvEkda.setText(listOfTable.get(position).toString())
    }
}