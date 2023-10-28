package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataBox

class AdapterNikeBox(val reqContext:Context,val listOfNikeBox:ArrayList<DataBox>,val span:Int):RecyclerView.Adapter<AdapterNikeBox.HolderNikeBox>() {

    val listOfBox= arrayListOf<DataBox>()
    class HolderNikeBox(itemView: View):RecyclerView.ViewHolder(itemView){
        val crdBox:CardView=itemView.findViewById(R.id.crdBox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderNikeBox {
        return HolderNikeBox(LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_box,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfNikeBox.size
    }

    override fun onBindViewHolder(holder: HolderNikeBox, position: Int) {

        val row=listOfNikeBox[position].row
        val column=listOfNikeBox[position].column

        if (listOfBox.contains(listOfNikeBox[position])){
            holder.crdBox.setCardBackgroundColor(reqContext.getColor(R.color.blue))
        }else{
            holder.crdBox.setCardBackgroundColor(reqContext.getColor(R.color.white))
        }

        holder.crdBox.setOnClickListener {

            upperColumn(row, column)
            crossUpperRight(row, column)

        }

    }
    fun upperColumn(row:Int,column:Int){

        if (row!=0) {
            listOfBox.add(DataBox(row - 1, column))
            notifyDataSetChanged()
            upperColumn(row - 1, column)
        }
    }
    fun crossUpperRight(row: Int,column: Int){
        if (row!=0 ){
            listOfBox.add(DataBox(row-1,column+1))
            notifyDataSetChanged()
            crossUpperRight(row-1,column+1)
        }
    }

}