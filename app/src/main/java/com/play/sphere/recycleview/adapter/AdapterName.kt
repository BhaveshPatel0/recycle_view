package com.play.sphere.recycleview.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterName(val reqiredContext: Context,var listOfName: ArrayList<String>) :
    RecyclerView.Adapter<AdapterName.HolderName>() {

    class HolderName(iteamView: View) : RecyclerView.ViewHolder(iteamView){

        val tvEkda: TextView =iteamView.findViewById(R.id.tvEkda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderName {
        return HolderName(
            LayoutInflater.from(reqiredContext).inflate(R.layout.rcv_item_ekda, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listOfName.size
    }

    override fun onBindViewHolder(holder: HolderName, position: Int) {
        val name=listOfName.get(position)

        if (position%2==0){
            holder.tvEkda.setTextColor(Color.RED)
        }
        else{
            holder.tvEkda.setTextColor(ContextCompat.getColor(reqiredContext,R.color.black))
        }
        holder.tvEkda.setText(name.toString())
    }
}