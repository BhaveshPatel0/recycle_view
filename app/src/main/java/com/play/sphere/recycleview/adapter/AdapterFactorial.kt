package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterFactorial(val reqContext: Context,val listOfFactorial:ArrayList<Long>):RecyclerView.Adapter<AdapterFactorial.HolderFactorial>() {

    class HolderFactorial(itemView:View):RecyclerView.ViewHolder(itemView){

        val tvEkda:TextView=itemView.findViewById(R.id.tvEkda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderFactorial {
        return HolderFactorial(LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_ekda,parent,false))
    }

    override fun getItemCount(): Int {
    return listOfFactorial.size
    }

    override fun onBindViewHolder(holder: HolderFactorial, position: Int) {
        holder.tvEkda.setText(listOfFactorial[position].toString())
    }
}