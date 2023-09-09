package com.play.sphere.recycleview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterBox

class BoxAct : AppCompatActivity() {
    private lateinit var edtNumberBox: EditText
    private lateinit var btnBox: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_box)
        bindView()
        bindClick()
    }

    private fun bindView() {

        edtNumberBox = findViewById(R.id.edtNumberBox)
        btnBox = findViewById(R.id.btnBox)


    }

    private fun bindClick() {

        btnBox.setOnClickListener {

            startActivity(
                Intent(this, BoxRecyclerAct::class.java).putExtra(
                    "number",
                    edtNumberBox.text.toString().toInt()
                )
            )

        }

    }
}