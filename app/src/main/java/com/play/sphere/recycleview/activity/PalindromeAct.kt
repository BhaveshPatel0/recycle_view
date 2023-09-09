package com.play.sphere.recycleview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.play.sphere.recycleview.R

class PalindromeAct : AppCompatActivity() {
    private lateinit var edtNumber: EditText
    private lateinit var btnAddNumber: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindrome)
        bindView()
        bindClick()
    }

    private fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnAddNumber = findViewById(R.id.btnAddNumber)
    }

    private fun bindClick() {
        btnAddNumber.setOnClickListener {

            startActivity(
                Intent(this, PalindromeCheckAct::class.java).putExtra(
                    "number",
                    edtNumber.text.toString().toInt()
                )
            )
        }

    }
}