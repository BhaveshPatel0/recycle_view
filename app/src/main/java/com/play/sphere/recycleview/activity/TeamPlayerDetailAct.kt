package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataTeam

class TeamPlayerDetailAct : AppCompatActivity() {

    private lateinit var imPlayerImage:ImageView
    private lateinit var tvPlayerName:TextView
    private lateinit var tvPlayerType:TextView
    private lateinit var tvPlayerAge:TextView

    lateinit var selectedPlayer:DataTeam

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_player_detail)

        intent.extras?.let {
            selectedPlayer=it.get("SelectedPlayer")as DataTeam
        }

        bindView()
        bindClick()
    }
    private fun bindView() {
        imPlayerImage=findViewById(R.id.imPlayerImage)
        tvPlayerName=findViewById(R.id.tvPlayerName)
        tvPlayerType=findViewById(R.id.tvPlayerType)
        tvPlayerAge=findViewById(R.id.tvPlayerAge)



        imPlayerImage.setImageResource(selectedPlayer.image)
        tvPlayerName.setText(selectedPlayer.playerName)
        tvPlayerType.setText(selectedPlayer.playerStyle)
        tvPlayerAge.setText(selectedPlayer.age.toString())


    }

    private fun bindClick() {

    }
}