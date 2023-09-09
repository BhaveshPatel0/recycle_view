package com.play.sphere.recycleview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.activity.ContactInfoAct
import com.play.sphere.recycleview.dataclass.DataContact

class AdapterContact(val reqContaxt:Context,val listOfContact:ArrayList<DataContact>):RecyclerView.Adapter<AdapterContact.HolderContact>() {

    class HolderContact(itemView:View):RecyclerView.ViewHolder(itemView){
        val tvContactName:TextView=itemView.findViewById(R.id.tvContactName)
        val tvContactNumber:TextView=itemView.findViewById(R.id.tvContactNumber)
        val llContact:LinearLayout=itemView.findViewById(R.id.llContact)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderContact {
        return HolderContact(LayoutInflater.from(reqContaxt).inflate(R.layout.rcv_item_contact,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfContact.size
    }

    override fun onBindViewHolder(holder: HolderContact, position: Int) {
        holder.tvContactName.setText(listOfContact.get(position).contactName)
        holder.tvContactNumber.setText(listOfContact.get(position).contactNumber.toString())
        holder.llContact.setOnClickListener {

            reqContaxt.startActivity(Intent(reqContaxt,ContactInfoAct::class.java).putExtra("selectContact",listOfContact.get(position)))
        }

    }
}