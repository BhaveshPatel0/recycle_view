package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterFruits
import com.play.sphere.recycleview.dataclass.DataFruits

class FruitsAct : AppCompatActivity() {

    private lateinit var rcvFruits:RecyclerView
    private lateinit var mAdapterFruits: AdapterFruits

    var listOfFruits= arrayListOf<DataFruits>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)

        listOfFruits.add(DataFruits(R.drawable.ic_apple,"Apple"))
        listOfFruits.add(DataFruits(R.drawable.ic_strawberry,"Strawberry"))
        listOfFruits.add(DataFruits(R.drawable.ic_coconut,"Coconut"))
        listOfFruits.add(DataFruits(R.drawable.ic_grapes,"Grapes"))
        listOfFruits.add(DataFruits(R.drawable.ic_guava,"Guava"))
        listOfFruits.add(DataFruits(R.drawable.ic_banna,"Banna"))
        listOfFruits.add(DataFruits(R.drawable.ic_lemon,"Lemon"))
        listOfFruits.add(DataFruits(R.drawable.ic_mango,"Mango"))
        listOfFruits.add(DataFruits(R.drawable.ic_orange,"Orange"))
        listOfFruits.add(DataFruits(R.drawable.ic_pinepple,"Pinepple"))
        listOfFruits.add(DataFruits(R.drawable.ic_watermelon,"Watermelon"))
        listOfFruits.add(DataFruits(R.drawable.ic_sugerapple,"Sugerapple"))
        listOfFruits.add(DataFruits(R.drawable.ic_pomegranate_dadam,"Pomegranate"))


        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvFruits=findViewById(R.id.rcvFruits)
        mAdapterFruits=AdapterFruits(this,listOfFruits)

        rcvFruits.layoutManager=GridLayoutManager(this,1)
        rcvFruits.adapter=mAdapterFruits
    }

    private fun bindClick() {

    }
}