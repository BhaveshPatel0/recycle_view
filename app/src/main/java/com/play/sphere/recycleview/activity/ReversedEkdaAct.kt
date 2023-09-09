package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterReversedEkda

class ReversedEkdaAct : AppCompatActivity() {
    private lateinit var edtEkda: EditText
    private lateinit var btnAns: Button
    private lateinit var rcvEkdaReversed: RecyclerView
    private lateinit var mAdapterReversedEkda: AdapterReversedEkda

    val listofEkda = arrayListOf<Int>()
    var a=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reversed_ekda)
        bindView()
        bindClick()
    }

    private fun bindView() {
        edtEkda = findViewById(R.id.edtEkda)
        btnAns = findViewById(R.id.btnAns)
        rcvEkdaReversed = findViewById(R.id.rcvEkdaReversed)
        mAdapterReversedEkda= AdapterReversedEkda(this,listofEkda)
    }

    private fun bindClick() {
        btnAns.setOnClickListener {

            val number = edtEkda.text.toString().toInt()

            for (num in 1..number)   {

                val a=number-num
                val b=a+1
                listofEkda.add(b)
            }

            rcvEkdaReversed.layoutManager=GridLayoutManager(this,1)
            rcvEkdaReversed.adapter=mAdapterReversedEkda
        }

    }

}