package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterTable

class TableAct : AppCompatActivity() {
    private lateinit var edtNumber: EditText
    private lateinit var btnGhadiyo: Button
    private lateinit var rcvTable: RecyclerView
    private lateinit var mAdapterTable: AdapterTable

    var listOfTable = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)
        bindView()
        bindClick()
    }

    private fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnGhadiyo = findViewById(R.id.btnGhadiyo)
        rcvTable = findViewById(R.id.rcvTable)
        mAdapterTable = AdapterTable(this, listOfTable)


    }

    private fun bindClick() {
        btnGhadiyo.setOnClickListener {

            val number = edtNumber.text.toString().toInt()

            for (editNumber in 1..number) {

                for (num in 1..10) {

                    val a = editNumber * num
                    val ans1 = "$editNumber * $num = $a"

                    listOfTable.add(ans1)

                    Log.d("TAG", "bindClick:$number * $num = $a ")

                }
            }

            rcvTable.layoutManager = GridLayoutManager(this, number)
            rcvTable.adapter = mAdapterTable

        }

    }
}