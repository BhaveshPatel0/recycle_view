package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterSqureCube

class SqureCubeAct : AppCompatActivity() {
    private lateinit var rcvSquareCube:RecyclerView
    private lateinit var mAdapterSqureCube: AdapterSqureCube

    val listOfNumber= arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_squre_cube)
        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvSquareCube=findViewById(R.id.rcvSquareCube)
        mAdapterSqureCube= AdapterSqureCube(this,listOfNumber)
        val num=intent.getIntExtra("Number",0)

        for (number in 1..num){

            listOfNumber.add(number)
        }

        rcvSquareCube.layoutManager=GridLayoutManager(this,1)
        rcvSquareCube.adapter=mAdapterSqureCube

    }

    private fun bindClick() {

    }
}