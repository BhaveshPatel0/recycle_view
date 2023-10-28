package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterMessage
import com.play.sphere.recycleview.dataclass.DataMessage
import com.play.sphere.recycleview.dataclass.DataWhatsApp

class MessageAct : AppCompatActivity() {
    private lateinit var rcvMessage:RecyclerView
    private lateinit var mAdapterMessage: AdapterMessage
    private lateinit var imProfilePhoto: ImageView
    private lateinit var tvContactName: TextView

    private var listOfMessage= arrayListOf<DataMessage>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        listOfMessage.add(DataMessage("Hi",R.drawable.ic_kohli,true))
        listOfMessage.add(DataMessage("Hi",R.drawable.ic_guava,false))
        listOfMessage.add(DataMessage("Hi",0,true))
        listOfMessage.add(DataMessage("Hi",R.drawable.ic_rohit,false))
        listOfMessage.add(DataMessage("wheighwogwhgowhvgohwovhwoh",0,true))
        listOfMessage.add(DataMessage("Hi",R.drawable.ic_risabhpant,false))
        listOfMessage.add(DataMessage("Hi",0,true))
        listOfMessage.add(DataMessage("fdhgmhgfjhffhjgui",0,false))
        listOfMessage.add(DataMessage("Hi",R.drawable.ic_pinepple,true))
        listOfMessage.add(DataMessage("Hi",R.drawable.ic_coconut,false))

        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvMessage=findViewById(R.id.rcvMessage)
        imProfilePhoto=findViewById(R.id.imProfilePhoto)
        tvContactName=findViewById(R.id.tvContactName)
        mAdapterMessage= AdapterMessage(this,listOfMessage)

        val whatsapp=intent.extras?.get("image") as DataWhatsApp

        imProfilePhoto.setImageResource(whatsapp.image)
        tvContactName.text = whatsapp.contactName

        rcvMessage.layoutManager=GridLayoutManager(this,1)
        rcvMessage.adapter=mAdapterMessage


    }

    private fun bindClick() {

    }
}
