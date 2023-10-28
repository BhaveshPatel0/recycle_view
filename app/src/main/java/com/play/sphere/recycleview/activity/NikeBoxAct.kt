package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterNikeBox
import com.play.sphere.recycleview.dataclass.DataBox

class NikeBoxAct : AppCompatActivity() {
    private lateinit var edtNumber: EditText
    private lateinit var btnAddNumber: Button
    private lateinit var rcvNikeBox: RecyclerView
    private lateinit var mAdapterNikeBox: AdapterNikeBox

    private var listOfNikeBox= arrayListOf<DataBox>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nike_box)
        bindView()
        bindClick()
    }
    private fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        rcvNikeBox = findViewById(R.id.rcvNikeBox)

    }
    private fun bindClick() {
        btnAddNumber.setOnClickListener {

            val number=edtNumber.text.toString().toInt()

            for (row in 0..number-1){
                for (column in 0..number-1){
                    listOfNikeBox.add(DataBox(row,column))
                }
            }
            mAdapterNikeBox=AdapterNikeBox(this,listOfNikeBox,number)

            rcvNikeBox.apply {

                layoutManager=GridLayoutManager(this@NikeBoxAct,number)
                adapter=mAdapterNikeBox

            }

        }
    }
}