package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R

class ImageVisibilityAct : AppCompatActivity() {
    private lateinit var rcvImage:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_visibility)


        bindView()
        bindClick()
    }

    private fun bindView() {

    }

    private fun bindClick() {

    }
}