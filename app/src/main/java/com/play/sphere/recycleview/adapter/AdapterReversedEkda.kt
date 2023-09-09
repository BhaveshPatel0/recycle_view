package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterReversedEkda(val reqiredContext:Context,val listOfRevrsedEkda:ArrayList<Int>):RecyclerView.Adapter<AdapterReversedEkda.HolderReversedEkda>() {

    class HolderReversedEkda(iteamView:View):RecyclerView.ViewHolder(iteamView){
        val tvEkda:TextView=iteamView.findViewById(R.id.tvEkda)
        val llParent:LinearLayout=itemView.findViewById(R.id.llParent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderReversedEkda {
        return HolderReversedEkda(LayoutInflater.from(reqiredContext).inflate(R.layout.rcv_item_ekda,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfRevrsedEkda.size
    }

    override fun onBindViewHolder(holder: HolderReversedEkda, position: Int) {

        val number=listOfRevrsedEkda.get(position).toString()

        if (position%2==0){
            holder.llParent.setBackgroundColor(reqiredContext.getColor(R.color.black))
            holder.tvEkda.setTextColor(reqiredContext.getColor(R.color.white))
        }
        else{
            holder.llParent.setBackgroundColor(reqiredContext.getColor(R.color.light_gray))
        }

        holder.tvEkda.setText(number.toString())
    }
}
