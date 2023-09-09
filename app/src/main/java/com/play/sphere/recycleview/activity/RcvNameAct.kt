package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterName

class RcvNameAct : AppCompatActivity() {
    lateinit var rcvName: RecyclerView
    lateinit var mAdapterName: AdapterName

    private var listOfLatter = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcv_name)
        bindView()
        binClick()

    }

    private fun bindView() {
        rcvName = findViewById(R.id.rcvName)
        val name = intent.getStringExtra("name")
        mAdapterName = AdapterName(this, listOfLatter)
        for (inex in 0..name!!.length - 1) {
            listOfLatter.add(name.get(inex).toString())
        }
        rcvName.layoutManager = GridLayoutManager(this, 1)
        rcvName.adapter = mAdapterName
    }

    private fun binClick() {

    }
}