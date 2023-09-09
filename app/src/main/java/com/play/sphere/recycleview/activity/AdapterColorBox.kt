package com.play.sphere.recycleview.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterColorBox(val reqContext: Context, val listOfColorBox: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterColorBox.HolderColorBox>() {

    class HolderColorBox(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        val tvTextBox: TextView = itemView.findViewById(R.id.tvTextBox)
//        val llColorBox:LinearLayout=itemView.findViewById(R.id.llColorBox)
        val crdRainbow:CardView=itemView.findViewById(R.id.crdRainbow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderColorBox {

        return HolderColorBox(
            LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_color_text, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listOfColorBox.size
    }

    override fun onBindViewHolder(holder: HolderColorBox, position: Int) {

        val color=listOfColorBox.get(position)

//        holder.llColorBox.setBackgroundColor(reqContext.getColor(color))
        holder.crdRainbow.setCardBackgroundColor(reqContext.getColor(color))
    }
}