package com.play.sphere.recycleview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.play.sphere.recycleview.R

class NameAct : AppCompatActivity() {
    lateinit var edtName:EditText
    lateinit var btnAnswer:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        bindView()
        bindClick()
    }

    private fun bindView() {
        edtName=findViewById(R.id.edtName)
        btnAnswer=findViewById(R.id.btnAnswer)
    }

    private fun bindClick() {

        btnAnswer.setOnClickListener {

            startActivity(Intent(this,RcvNameAct::class.java).putExtra("name",edtName.text.toString()))
        }
    }
}