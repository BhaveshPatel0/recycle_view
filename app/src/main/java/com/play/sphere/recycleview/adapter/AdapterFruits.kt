package com.play.sphere.recycleview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.activity.FruitsDetailAct
import com.play.sphere.recycleview.dataclass.DataFruits

class AdapterFruits(val reqContext: Context, val listOfFrits: ArrayList<DataFruits>) :
    RecyclerView.Adapter<AdapterFruits.HolderFruits>() {

    class HolderFruits(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imFruitsImage: ImageView = itemView.findViewById(R.id.imFruitsImage)
        val tvFruitsName: TextView = itemView.findViewById(R.id.tvFruitsName)
        val llFruits: LinearLayout = itemView.findViewById(R.id.llFruits)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderFruits {
        return HolderFruits(
            LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_fruits, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listOfFrits.size
    }

    override fun onBindViewHolder(holder: HolderFruits, position: Int) {

        holder.imFruitsImage.setImageResource(listOfFrits.get(position).fruitsImage)
        holder.tvFruitsName.setText(listOfFrits.get(position).fruitsName)

        holder.llFruits.setOnClickListener {

            reqContext.startActivity(Intent(reqContext, FruitsDetailAct::class.java)
                .putExtra("fruits",listOfFrits.get(position)))

        }

    }

}