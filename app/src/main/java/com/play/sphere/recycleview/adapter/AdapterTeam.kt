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
import com.play.sphere.recycleview.activity.TeamPlayerDetailAct
import com.play.sphere.recycleview.dataclass.DataTeam

class AdapterTeam(val reqiredContext:Context,private val listOfTeam:ArrayList<DataTeam>):RecyclerView.Adapter<AdapterTeam.HolderTeamIndia>() {

    class HolderTeamIndia(itemView:View):RecyclerView.ViewHolder(itemView){

        val ivteamPlayer:ImageView=itemView.findViewById(R.id.ivteamPlayer)
        val tvPlayerName:TextView=itemView.findViewById(R.id.tvPlayerName)
        val llPlayer:LinearLayout=itemView.findViewById(R.id.llPlayer)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderTeamIndia {
        return HolderTeamIndia(LayoutInflater.from(reqiredContext).inflate(R.layout.rcv_item_india_team,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfTeam.size
    }

    override fun onBindViewHolder(holder: HolderTeamIndia, position: Int) {

        holder.ivteamPlayer.setImageResource(listOfTeam.get(position).image)
        holder.tvPlayerName.setText(listOfTeam.get(position).playerName)
        holder.llPlayer.setOnClickListener {

            reqiredContext.startActivity(Intent(reqiredContext,TeamPlayerDetailAct::class.java)
                .putExtra("SelectedPlayer",listOfTeam.get(position)))
                }

    }

}