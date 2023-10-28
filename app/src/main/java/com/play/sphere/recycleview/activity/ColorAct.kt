package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterColor

class ColorAct : AppCompatActivity() {
    private lateinit var rcvColor:RecyclerView
    private lateinit var mAdapterColor: AdapterColor

    private val listOfColor= arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        listOfColor.add(R.color.orange)
        listOfColor.add(R.color.yellow)
        listOfColor.add(R.color.red)
        listOfColor.add(R.color.green)
        listOfColor.add(R.color.white)
        listOfColor.add(R.color.light_gray)
        listOfColor.add(R.color.blue)
        listOfColor.add(R.color.violet)
        listOfColor.add(R.color.indigo)


        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvColor=findViewById(R.id.rcvColor)
        mAdapterColor=AdapterColor(this,listOfColor)


        rcvColor.layoutManager=GridLayoutManager(this,1)
        rcvColor.adapter=mAdapterColor
    }

    private fun bindClick() {

    }
}