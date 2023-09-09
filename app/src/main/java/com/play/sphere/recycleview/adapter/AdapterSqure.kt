package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterSqure(val reqiredContext: Context, val listOfSqure: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterSqure.HolerSqure>() {
    class HolerSqure(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvEkda: TextView = itemView.findViewById(R.id.tvEkda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolerSqure {
        return HolerSqure(
            LayoutInflater.from(reqiredContext).inflate(R.layout.rcv_item_ekda, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listOfSqure.size
    }

    override fun onBindViewHolder(holder: HolerSqure, position: Int) {

        val squre = listOfSqure.get(position)
        if (squre%2==0 ){

            val ans = squre * squre
            holder.tvEkda.setText(listOfSqure.get(position).toString().plus("==> $ans"))
        }
        else{
            val ans=squre*squre*squre
            holder.tvEkda.setText(listOfSqure.get(position).toString().plus("==>$ans"))
        }



    }

}