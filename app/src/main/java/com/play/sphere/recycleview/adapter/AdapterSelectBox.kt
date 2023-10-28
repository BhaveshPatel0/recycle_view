package com.play.sphere.recycleview.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataBox

class AdapterSelectBox(
    val reqContext: Context,
    val listOfSelectBox: ArrayList<DataBox>,
    val span: Int
) :
    RecyclerView.Adapter<AdapterSelectBox.HolderSelectBox>() {

    val listOfBox = arrayListOf<DataBox>()

    class HolderSelectBox(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //        val crdSelectBox: CardView = itemView.findViewById(R.id.crdSelectBox)
        val tvEkda: TextView = itemView.findViewById(R.id.tvEkda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderSelectBox {
        return HolderSelectBox(
            LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_ekda, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return listOfSelectBox.size
    }

    override fun onBindViewHolder(holder: HolderSelectBox, position: Int) {

        val row=listOfSelectBox[position].row
        val column=listOfSelectBox[position].column
        if (listOfBox.contains(listOfSelectBox[position])){
            holder.tvEkda.setTextColor(reqContext.getColor(R.color.blue))
        }
        else{
            holder.tvEkda.setTextColor(reqContext.getColor(R.color.white))
        }

        holder.tvEkda.text="($row,$column)"
        holder.tvEkda.setOnClickListener {
            verticalUpper(row, column)
            verticalLower(row, column)
            horizontalLeft(row, column)
            horizontalRight(row, column)
            crossUpperLeft(row, column)
            crossUppeRight(row, column)
            crossLowerLeft(row, column)
            crossLowereRight(row, column)
        }
    }

    fun verticalUpper(row:Int,column:Int){
        if (row!=0) {
            listOfBox.add(DataBox(row - 1, column))
            notifyDataSetChanged()
            verticalUpper(row-1,column)
        }
    }
    fun verticalLower(row:Int,column:Int){
        if (row!=span) {
            listOfBox.add(DataBox(row + 1, column))
            notifyDataSetChanged()
            verticalLower(row+1,column)
        }
    }
    fun horizontalLeft(row:Int,column:Int){
        if (column!=0) {
            listOfBox.add(DataBox(row , column-1))
            notifyDataSetChanged()
            horizontalLeft(row,column-1)
        }
    }
    fun horizontalRight(row:Int,column:Int){
        if (column!=span) {
            listOfBox.add(DataBox(row , column+1))
            notifyDataSetChanged()
            horizontalRight(row,column+1)
        }
    }
    fun crossUpperLeft(row:Int,column: Int){
        if (row!=0){
            listOfBox.add(DataBox(row-1,column-1))
            notifyDataSetChanged()
            crossUpperLeft(row-1,column-1)
        }
    }
    fun crossUppeRight(row:Int,column: Int){
        if (row!=0){
            listOfBox.add(DataBox(row-1,column+1))
            notifyDataSetChanged()
            crossUppeRight(row-1,column+1)
        }
    }
    fun crossLowereRight(row:Int,column: Int){
        if (column!=span){
            listOfBox.add(DataBox(row+1,column+1))
            notifyDataSetChanged()
            crossLowereRight(row+1,column+1)
        }
    }
    fun crossLowerLeft(row:Int,column: Int){
        if (column!=0){
            listOfBox.add(DataBox(row+1,column-1))
            notifyDataSetChanged()
            crossLowerLeft(row+1,column-1)
        }
    }
}