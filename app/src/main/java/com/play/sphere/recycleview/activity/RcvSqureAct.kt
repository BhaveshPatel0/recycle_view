package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterSqure

class RcvSqureAct : AppCompatActivity() {
    lateinit var rcvSqure:RecyclerView
    private lateinit var mAdapterSqure: AdapterSqure

    var listOfSqure= arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcv_squre)
        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvSqure=findViewById(R.id.rcvSqure)
        val number=intent.getIntExtra("number",0)
        for (num in 1..number ){

            listOfSqure.add(num)
        }


        mAdapterSqure= AdapterSqure(this,listOfSqure)
        rcvSqure.layoutManager=GridLayoutManager(this,1)
        rcvSqure.adapter=mAdapterSqure
    }

    private fun bindClick() {

    }
}