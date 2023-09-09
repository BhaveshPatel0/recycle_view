package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterTeam
import com.play.sphere.recycleview.dataclass.DataTeam

class IndiaTeamAct : AppCompatActivity() {
    private lateinit var rcvTeamPlayer:RecyclerView
    lateinit var mAdapterTeam: AdapterTeam

    var listOfTeamIndai= arrayListOf<DataTeam>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_india_team)

        listOfTeamIndai.add(DataTeam(R.drawable.ic_bumrah,"Jasprit Bumrah","Right Hand Bolwer",30))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_rohit,"Rohit Sharma","Right Hand Batsman",20))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_kohli,"Virat Kohli","Right Hand Batsman",35))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_suryakumar,"SuryaKumar Yadav","Right Hand Batsman",25))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_ishant,"Ishant Sharma","Right Hand Bolwer",25))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_hardik,"Hardik Pandya","Right Hand All Rounder",46))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_jadeja,"Ravindra Jadeja","Left Hand All Rounder",48))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_kl,"KL Rahul","Right Hand Batsman",28))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_ms,"MS Dhoni","wicketKeeper",39))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_sachin,"Sachin Tendulkar","Right Hand Batsman",20))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_risabhpant,"Rishabh Pant","wicketKeeper $ Left Hand Batsman",39))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_sanjubaba,"Sanju Samson","wicketKeeper $ Right Hand Batsman",29))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_shami,"Mohammed Shami","Right Hand Bolwer",25))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_yuvraj,"Yuvraj Singh","Left Hand Batsman",28))
        listOfTeamIndai.add(DataTeam(R.drawable.ic_siraj,"Mohamaad Siraj","Right Hand Bolwer",24))


        bindView()
        bindClick()

    }

    private fun bindView() {
        rcvTeamPlayer=findViewById(R.id.rcvTeamPlayer)
        mAdapterTeam= AdapterTeam(this,listOfTeamIndai)

        rcvTeamPlayer.layoutManager=GridLayoutManager(this,1)
        rcvTeamPlayer.adapter=mAdapterTeam

    }

    private fun bindClick() {

    }
}