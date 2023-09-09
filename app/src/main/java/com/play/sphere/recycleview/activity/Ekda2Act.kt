package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterEkda

class Ekda2Act : AppCompatActivity() {
    lateinit var rcvEkda: RecyclerView

    private lateinit var mAdapterEkda: AdapterEkda
    var listOfEkda= arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ekda2)



        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvEkda=findViewById(R.id.rcvEkda)
        val number=intent.getIntExtra("number",0)
        for (num in 1..number ){

            listOfEkda.add(num)
        }

        mAdapterEkda=AdapterEkda(this,listOfEkda)
        rcvEkda.layoutManager=GridLayoutManager(this,1)
        rcvEkda.adapter=mAdapterEkda
    }

    private fun bindClick() {

    }
}