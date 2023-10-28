package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataImage

class AdapterImage(val reqContext: Context, val listOfURL: ArrayList<DataImage>) :
    RecyclerView.Adapter<AdapterImage.HolderImage>() {

    class HolderImage(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val ivURLImage:ImageView=itemView.findViewById(R.id.ivURLImage)
        val tvImageName:TextView=itemView.findViewById(R.id.tvImageName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderImage =
        HolderImage(LayoutInflater.from(reqContext).inflate(R.layout.item_image,parent,false))

    override fun getItemCount(): Int {

        return listOfURL.size
    }

    override fun onBindViewHolder(holder: HolderImage, position: Int) {

        Glide
            .with(reqContext)
            .load(listOfURL[position].url)
            .into(holder.ivURLImage)
//        holder.ivURLImage.setVideoPath(listOfURL[position].url)
//        holder.ivURLImage.start()
        holder.tvImageName.text= listOfURL[position].name


    }
}