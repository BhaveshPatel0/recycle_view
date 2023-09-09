package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterMessage
import com.play.sphere.recycleview.dataclass.DataMessage

class MessageAct : AppCompatActivity() {
    private lateinit var rcvMessage:RecyclerView
    private lateinit var mAdapterMessage: AdapterMessage

    private var listOfMessage= arrayListOf<DataMessage>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        listOfMessage.add(DataMessage("Hi",true))
        listOfMessage.add(DataMessage("Hi",false))
        listOfMessage.add(DataMessage("Hi",true))
        listOfMessage.add(DataMessage("Hi",false))
        listOfMessage.add(DataMessage("Hikghgkiwhgiwhgkiwheighwogwhgowhvgohwovhwoh  ",true))
        listOfMessage.add(DataMessage("Hi",false))
        listOfMessage.add(DataMessage("Hi",true))
        listOfMessage.add(DataMessage("Hibscvjbsdjvbksdabhvkasdvjkgsdkvsdv",false))
        listOfMessage.add(DataMessage("Hi",false))
        listOfMessage.add(DataMessage("Hi",false))

        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvMessage=findViewById(R.id.rcvMessage)
        mAdapterMessage= AdapterMessage(this,listOfMessage)

        rcvMessage.layoutManager=GridLayoutManager(this,1)
        rcvMessage.adapter=mAdapterMessage


    }

    private fun bindClick() {

    }
}