package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterBox

class BoxRecyclerAct : AppCompatActivity() {
    private lateinit var rcvBox: RecyclerView
    private lateinit var mAdapterBox: AdapterBox

    var listOfBox = arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_box_recycler)
        bindView()
        bindClick()

    }

    private fun bindView() {
        rcvBox = findViewById(R.id.rcvBox)
        mAdapterBox = AdapterBox(this, listOfBox)

        val num = intent.getIntExtra("number", 0)

        for (box in 1..num*num){


            listOfBox.add(box)

        }

//        Log.d("TAG", "bindView:${listOfBox.size} ")

        rcvBox.layoutManager = GridLayoutManager(this, num)
        rcvBox.adapter = mAdapterBox
    }

    private fun bindClick() {

    }
}