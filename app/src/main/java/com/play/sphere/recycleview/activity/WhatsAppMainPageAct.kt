package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterWhatsApp
import com.play.sphere.recycleview.dataclass.DataWhatsApp

class WhatsAppMainPageAct : AppCompatActivity() {

    private lateinit var rcvWhatsApp:RecyclerView
    private lateinit var mAdapterWhatsApp: AdapterWhatsApp

    val listOfWhatsAppDetail= arrayListOf<DataWhatsApp>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whats_app_main_page)

        bindView()
        bindClick()

    }

    private fun bindView() {
        rcvWhatsApp=findViewById(R.id.rcvWhatsApp)
        mAdapterWhatsApp= AdapterWhatsApp(this,listOfWhatsAppDetail)

        listOfWhatsAppDetail.add(DataWhatsApp(R.drawable.ic_kohli,"Kohli","Zero Run "))

        rcvWhatsApp.layoutManager=GridLayoutManager(this,1)
        rcvWhatsApp.adapter=mAdapterWhatsApp

    }

    private fun bindClick() {

    }
}