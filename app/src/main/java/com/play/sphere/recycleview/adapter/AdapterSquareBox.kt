package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataBox

class AdapterSquareBox(val reqContext:Context,val listOfSquareBox:ArrayList<DataBox>):RecyclerView.Adapter<AdapterSquareBox.HolderSquareBox>() {

    val listOfBox= arrayListOf<DataBox>()
    class HolderSquareBox(itemView:View):RecyclerView.ViewHolder(itemView){
        val crdBox:CardView=itemView.findViewById(R.id.crdBox)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderSquareBox {
     return HolderSquareBox(LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_box,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfSquareBox.size
    }

    override fun onBindViewHolder(holder: HolderSquareBox, position: Int) {
        val row=listOfSquareBox[position].row
        val column=listOfSquareBox[position].column

        if (listOfBox.contains(listOfSquareBox[position])){
            holder.crdBox.setCardBackgroundColor(reqContext.getColor(R.color.blue))
        }
        else{
            holder.crdBox.setCardBackgroundColor(reqContext.getColor(R.color.white))
        }

        holder.crdBox.setOnClickListener {

            listOfBox.add(DataBox(row-1,column-1))
            listOfBox.add(DataBox(row-1,column))
            listOfBox.add(DataBox(row-1,column+1))
            listOfBox.add(DataBox(row,column+1))
            listOfBox.add(DataBox(row+1,column+1))
            listOfBox.add(DataBox(row+1,column))
            listOfBox.add(DataBox(row+1,column-1))
            listOfBox.add(DataBox(row,column-1))
            notifyDataSetChanged()
        }
    }

}