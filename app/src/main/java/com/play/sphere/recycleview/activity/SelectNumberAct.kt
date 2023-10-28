package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterSelectBox
import com.play.sphere.recycleview.dataclass.DataBox

class SelectNumberAct : AppCompatActivity() {
    private lateinit var edtNumber: EditText
    private lateinit var btnBox: Button
    private lateinit var rcvSelectBox: RecyclerView
    private lateinit var mAdapterSelectBox: AdapterSelectBox

    private val listOfSelectBox = arrayListOf<DataBox>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_number)
        bindView()
        bindClick()
    }

    private fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnBox = findViewById(R.id.btnBox)
        rcvSelectBox = findViewById(R.id.rcvSelectBox)

    }

    private fun bindClick() {
        btnBox.setOnClickListener {

            val numberBox = edtNumber.text.toString().toInt()


//            for (box in 1..numberBox*numberBox){
//
//                listOfSelectBox.add(box)
//
//            }
//
            listOfSelectBox.clear()
            for (row in 0..numberBox-1) {

                for (column in 0..numberBox-1) {

                    listOfSelectBox.add(DataBox(row, column))

                }

            }
            mAdapterSelectBox = AdapterSelectBox(this, listOfSelectBox, numberBox)
            Log.d("TAG", "bindClick:$listOfSelectBox ")

            rcvSelectBox.layoutManager = GridLayoutManager(this, numberBox)
            rcvSelectBox.adapter = mAdapterSelectBox

        }
    }
}