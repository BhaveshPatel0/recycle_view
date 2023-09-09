package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterFactorial

class FactorialNumberAct : AppCompatActivity() {
    private lateinit var edtNumber: EditText
    private lateinit var btnAns: Button
    private lateinit var rcvFactorial: RecyclerView
    private lateinit var mAdapterFactorial: AdapterFactorial

    var listOfFactorial = arrayListOf<Long>()

//    private var list: Long = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factorial_number)
        bindView()
        bindClick()
    }

    private fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnAns = findViewById(R.id.btnAns)
        rcvFactorial = findViewById(R.id.rcvFactorial)
        mAdapterFactorial = AdapterFactorial(this, listOfFactorial)

        rcvFactorial.layoutManager = GridLayoutManager(this, 1)
        rcvFactorial.adapter = mAdapterFactorial

    }

    private fun bindClick() {

        btnAns.setOnClickListener {

            val number = edtNumber.text.toString().toInt()

            listOfFactorial.clear()

            var list: Long =1
//            listOfFactorial.add(1)
            for (factorial in 1..number) {

//                list *= factorial
                list=factorial*list
                listOfFactorial.add(list)

//                Log.d("TAG", "bindClick:$listOfFactorial ")

            }
            mAdapterFactorial.notifyDataSetChanged()

        }
    }
}