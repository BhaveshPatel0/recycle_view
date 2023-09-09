package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataFruits

class FruitsDetailAct : AppCompatActivity() {
    private lateinit var imFruitsImage:ImageView
    private lateinit var tvFruitsName:TextView

    lateinit var fruits:DataFruits

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits_detail)

        intent.extras?.let {
            fruits=it.get("fruits")as DataFruits
        }

        bindView()
        bindClick()
    }

    private fun bindView() {
        imFruitsImage=findViewById(R.id.imFruitsImage)
        tvFruitsName=findViewById(R.id.tvFruitsName)

        imFruitsImage.setImageResource(fruits.fruitsImage)
        tvFruitsName.setText(fruits.fruitsName)


    }

    private fun bindClick() {

    }
}