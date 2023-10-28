package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import java.util.Collections

class AdapterOddNumber(val reqContext: Context, val listOfOddNumber: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterOddNumber.HolderOddNumber>() {

    class HolderOddNumber(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvEkda: TextView = itemView.findViewById(R.id.tvEkda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderOddNumber =
        HolderOddNumber(
            LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_ekda, parent, false)
        )

    override fun getItemCount(): Int {
        return listOfOddNumber.size
//        return 1
    }

    override fun onBindViewHolder(holder: HolderOddNumber, position: Int) {

        val num = listOfOddNumber[position]
//        val c = listOfOddNumber.get(listOfOddNumber.size - 2)



//        listOfOddNumber.sort()
//        val a=listOfOddNumber.size-2

//        listOfOddNumber.add(a)

//        listOfOddNumber.indexOf(number)

//        if (num == c) {
//            holder.tvEkda.setText("$c is second large")
//        } else {

//        Collections.rotate(listOfOddNumber,-2)

        holder.tvEkda.text = num.toString()
        }



}