package com.play.sphere.recycleview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.play.sphere.recycleview.R

class SqureAct : AppCompatActivity() {
    lateinit var edtNumber: EditText
    lateinit var btnAnswer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_squre)
        bindView()
        bindClick()
    }

    private fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnAnswer = findViewById(R.id.btnAnswer)

    }

    private fun bindClick() {

        btnAnswer.setOnClickListener {

            startActivity(
                Intent(this, RcvSqureAct::class.java).putExtra(
                    "number",
                    edtNumber.text.toString().toInt()))
        }
    }
}