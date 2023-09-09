package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterBox(val reqContext:Context,val listOfBox:ArrayList<Int>):RecyclerView.Adapter<AdapterBox.HolderBox>() {

    class HolderBox(itemView:View):RecyclerView.ViewHolder(itemView){
        val crdBox:CardView=itemView.findViewById(R.id.crdBox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderBox {
        return HolderBox(LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_box,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfBox.size
    }

    override fun onBindViewHolder(holder: HolderBox, position: Int) {
        val box=listOfBox.get(position)

        if (box%2==0){

            holder.crdBox.setCardBackgroundColor(reqContext.getColor(R.color.white))
        }
        else{
            holder.crdBox.setCardBackgroundColor(reqContext.getColor(R.color.black
            ))

        }

    }
}