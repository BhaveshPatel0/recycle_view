package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterCountClickBox(val reqContext: Context, val listOfClickCountBox: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterCountClickBox.HolderCountClickBox>() {

    val listOfBoxNumber = arrayListOf<Int>()
    var count = 0

    class HolderCountClickBox(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val crdSelectBox: CardView = itemView.findViewById(R.id.crdSelectBox)
        val tvNumber: TextView = itemView.findViewById(R.id.tvNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        HolderCountClickBox(
            LayoutInflater.from(reqContext).inflate(R.layout.item_select_box, parent, false)
        )

    override fun getItemCount(): Int {
        return listOfClickCountBox.size
    }

    override fun onBindViewHolder(holder: HolderCountClickBox, position: Int) {
        val number = listOfClickCountBox[position]
        holder.tvNumber.text = number.toString()
        holder.crdSelectBox.setOnClickListener {
            if (!listOfBoxNumber.contains(number)) {
                listOfBoxNumber.add(number)
                Toast.makeText(reqContext, "${listOfBoxNumber}", Toast.LENGTH_SHORT).show()
                holder.crdSelectBox.setCardBackgroundColor(reqContext.getColor(R.color.blue))
            }else{
                Toast.makeText(reqContext, "Number Already Exist", Toast.LENGTH_SHORT).show()
            }
        }
    }
}