package com.play.sphere.recycleview.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataMessage

class AdapterMessage(val reqContext: Context, val listOfMessage: ArrayList<DataMessage>) :
    RecyclerView.Adapter<AdapterMessage.HolderMessage>() {

    class HolderMessage(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvSendMessage: TextView = itemView.findViewById(R.id.tvSendMessage)
        val tvReceiveMessage: TextView = itemView.findViewById(R.id.tvReceiveMessage)
        val crdSendMessage: CardView = itemView.findViewById(R.id.crdSendMessage)
        val crdReceiveMessage: CardView = itemView.findViewById(R.id.crdReceiveMessage)
        val imSendImage: ImageView = itemView.findViewById(R.id.imSendImage)
        val imReceiveImage: ImageView = itemView.findViewById(R.id.imReceiveImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderMessage =
        HolderMessage(
            LayoutInflater.from(reqContext).inflate(
                R.layout.rcv_item_message, parent, false
            )
        )

    override fun getItemCount(): Int {
        return listOfMessage.size
    }

    override fun onBindViewHolder(holder: HolderMessage, position: Int) {

        val message = listOfMessage.get(position)

        if (message.isSend) {

            holder.imReceiveImage.visibility = View.GONE
            if (message.image != 0) {
                holder.imSendImage.setImageResource(message.image)
                holder.imSendImage.visibility = View.VISIBLE
            } else {
                holder.imSendImage.visibility = View.GONE
            }

            holder.tvSendMessage.text = listOfMessage[position].message
            Log.d("TAGA", "onBindViewHolder: ${message.message}")
            holder.tvReceiveMessage.visibility = View.INVISIBLE
            holder.tvSendMessage.visibility = View.VISIBLE
            holder.crdReceiveMessage.visibility = View.VISIBLE
            holder.crdSendMessage.visibility = View.INVISIBLE

        } else {
            holder.imSendImage.visibility = View.GONE
            if (message.image != 0) {
                holder.imReceiveImage.setImageResource(message.image)
                holder.imReceiveImage.visibility = View.VISIBLE
            } else {
                holder.imReceiveImage.visibility = View.GONE
            }

            holder.tvReceiveMessage.text = listOfMessage[position].message
            Log.d("TAG", "onBindViewHolder:${message.message} ")
            holder.tvReceiveMessage.visibility = View.VISIBLE
            holder.tvSendMessage.visibility = View.INVISIBLE
            holder.crdSendMessage.visibility = View.VISIBLE
            holder.crdReceiveMessage.visibility = View.INVISIBLE

        }
    }
}