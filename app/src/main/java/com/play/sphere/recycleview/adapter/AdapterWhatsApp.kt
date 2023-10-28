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
import com.play.sphere.recycleview.activity.MessageAct
import com.play.sphere.recycleview.dataclass.DataWhatsApp

class AdapterWhatsApp(val reqContext:Context,val listOfContactDetail:ArrayList<DataWhatsApp>):RecyclerView.Adapter<AdapterWhatsApp.HolderWhatsApp>() {

    class HolderWhatsApp(itemView:View):RecyclerView.ViewHolder(itemView){
        val llWhatsAppContactDetail:LinearLayout=itemView.findViewById(R.id.llWhatsAppContactDetail)
        val imProfilePhoto:ImageView=itemView.findViewById(R.id.imProfilePhoto)
        val tvContactName:TextView=itemView.findViewById(R.id.tvContactName)
        val tvContactLastChat:TextView=itemView.findViewById(R.id.tvContactLastChat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderWhatsApp =
        HolderWhatsApp(LayoutInflater.from(reqContext).inflate(R.layout.rcv_item_whatsapp_name,parent,false))

    override fun getItemCount(): Int {
        return listOfContactDetail.size
    }

    override fun onBindViewHolder(holder: HolderWhatsApp, position: Int) {

        val list=listOfContactDetail[position]

        holder.llWhatsAppContactDetail.setOnClickListener {

            reqContext.startActivity(Intent(reqContext,MessageAct::class.java).putExtra("image",list))
        }
        holder.imProfilePhoto.setImageResource(list.image)
        holder.tvContactName.text=list.contactName
          holder.tvContactLastChat.text=list.contactLastChat
    }
}