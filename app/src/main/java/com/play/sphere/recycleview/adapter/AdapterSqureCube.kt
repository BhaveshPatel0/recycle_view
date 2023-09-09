package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterSqureCube(val reqContext: Context, val listOfNumber: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterSqureCube.HolderSquareCube>() {

    class HolderSquareCube(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNumber:TextView=itemView.findViewById(R.id.tvNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderSquareCube {
        return HolderSquareCube(
            LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_square_cube, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listOfNumber.size
    }

    override fun onBindViewHolder(holder: HolderSquareCube, position: Int) {

        val number=listOfNumber.get(position)

        val square=number*number
        val cube=number*number*number
        val four=number*number*number*number

        holder.tvNumber.setText(number.toString().plus(" --> $square --> $cube --> $four"))
    }
}