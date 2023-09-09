package com.play.sphere.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataMessage

class AdapterMessage(val reqContext: Context, val listOfMessage: ArrayList<DataMessage>) :
    RecyclerView.Adapter<AdapterMessage.HolderMessage>() {

    class HolderMessage(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvSendMessage:TextView=itemView.findViewById(R.id.tvSendMessage)
        val tvReceiveMessage:TextView=itemView.findViewById(R.id.tvReceiveMessage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderMessage =
        HolderMessage(
            LayoutInflater.from(reqContext).inflate(
                R.layout.rcv_item_message,parent,false
            )
        )

    override fun getItemCount(): Int {
        return listOfMessage.size
    }

    override fun onBindViewHolder(holder: HolderMessage, position: Int) {

        val message=listOfMessage.get(position)

        if (message.isSend) {
            holder.tvSendMessage.text = listOfMessage[position].message
            holder.tvReceiveMessage.visibility=View.INVISIBLE
            holder.tvSendMessage.visibility=View.VISIBLE

        }
        else {
            holder.tvReceiveMessage.text = listOfMessage[position].message
            holder.tvReceiveMessage.visibility=View.VISIBLE
            holder.tvSendMessage.visibility=View.INVISIBLE
        }
    }
}