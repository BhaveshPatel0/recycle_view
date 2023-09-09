package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class AdapterPalindrome(val reqContext: Context, val listOfPalindrome: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterPalindrome.HolderPalindrome>() {

    class HolderPalindrome(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvEkda: TextView = itemView.findViewById(R.id.tvEkda)
        val llParent: LinearLayout = itemView.findViewById(R.id.llParent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPalindrome {
        return HolderPalindrome(
            LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_ekda, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listOfPalindrome.size
    }

    override fun onBindViewHolder(holder: HolderPalindrome, position: Int) {

        val num = listOfPalindrome.get(position)

        val cube = num * num * num

        val number = cube.toString().reversed()

        if (cube == number.toInt()) {
//            cube.toString().reversed()
            holder.tvEkda.setText("$cube is true")
            holder.llParent.setBackgroundColor(reqContext.getColor(R.color.black))
            holder.tvEkda.setTextColor(ContextCompat.getColor(reqContext, R.color.white))
        } else {
            holder.tvEkda.setText("$cube is false")
            holder.llParent.setBackgroundColor(reqContext.getColor(R.color.white))


        }

    }
}