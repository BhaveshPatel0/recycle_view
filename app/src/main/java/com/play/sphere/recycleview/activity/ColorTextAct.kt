package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterColorBox

class ColorTextAct : AppCompatActivity() {
    private lateinit var rcvColorText: RecyclerView
    private lateinit var mAdapterColorBox: AdapterColorBox

    var listOfColorBox = arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_text)

        listOfColorBox.add(R.color.red)
        listOfColorBox.add(R.color.orange)
        listOfColorBox.add(R.color.yellow)
        listOfColorBox.add(R.color.green)
        listOfColorBox.add(R.color.blue)
        listOfColorBox.add(R.color.indigo)
        listOfColorBox.add(R.color.violet)


        bindView()
        bindClick()

    }

    private fun bindView() {
        rcvColorText = findViewById(R.id.rcvColorText)
        mAdapterColorBox = AdapterColorBox(this, listOfColorBox)

        rcvColorText.layoutManager = GridLayoutManager(this, 1)
        rcvColorText.adapter = mAdapterColorBox


    }

    private fun bindClick() {

    }
}