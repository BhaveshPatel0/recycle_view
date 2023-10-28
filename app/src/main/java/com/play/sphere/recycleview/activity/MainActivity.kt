package com.play.sphere.recycleview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.arrays.PracticeAct

class MainActivity : AppCompatActivity() {
    private lateinit var btnColor:Button
    private lateinit var btnClickCount:Button
    private lateinit var btnSquareBox:Button
    private lateinit var btnNikeBox:Button
    private lateinit var btnSelectBox:Button
    private lateinit var btnEka:Button
    private lateinit var btnImage:Button
    private lateinit var btnSqure:Button
    private lateinit var btnName:Button
    private lateinit var btnReversed:Button
    private lateinit var btnTeamIndia:Button
    private lateinit var btnContactNumber:Button
    private lateinit var btnFood:Button
    private lateinit var btnNumberSquareCube:Button
    private lateinit var btnPalindrome:Button
    private lateinit var btnBox:Button
    private lateinit var btnFactorial:Button
    private lateinit var btnColorText:Button
    private lateinit var btnTable:Button
    private lateinit var btnMessage:Button
    private lateinit var btnPractice:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        bindClick()

    }

    private fun bindView() {
        btnColor =findViewById(R.id.btnColor)
        btnClickCount =findViewById(R.id.btnClickCount)
        btnNikeBox =findViewById(R.id.btnNikeBox)
        btnSquareBox =findViewById(R.id.btnSquareBox)
        btnSelectBox =findViewById(R.id.btnSelectBox)
        btnEka =findViewById(R.id.btnEka)
        btnImage =findViewById(R.id.btnImage)
        btnSqure=findViewById(R.id.btnSqure)
        btnName=findViewById(R.id.btnName)
        btnReversed=findViewById(R.id.btnReversed)
        btnTeamIndia=findViewById(R.id.btnTeamIndia)
        btnContactNumber=findViewById(R.id.btnContactNumber)
        btnFood=findViewById(R.id.btnFood)
        btnNumberSquareCube=findViewById(R.id.btnNumberSquareCube)
        btnBox=findViewById(R.id.btnBox)
        btnPalindrome=findViewById(R.id.btnPalindrome)
        btnFactorial=findViewById(R.id.btnFactorial)
        btnColorText=findViewById(R.id.btnColorText)
        btnTable=findViewById(R.id.btnTable)
        btnMessage=findViewById(R.id.btnMessage)
        btnPractice=findViewById(R.id.btnPractice)

    }

    private fun bindClick() {
        btnSelectBox.setOnClickListener {
            startActivity(Intent(this,SelectNumberAct::class.java))
        }
        btnClickCount.setOnClickListener {
            startActivity(Intent(this,ClickCountAct::class.java))
        }
        btnNikeBox.setOnClickListener {
            startActivity(Intent(this,NikeBoxAct::class.java))
        }
        btnSquareBox.setOnClickListener {
            startActivity(Intent(this,SquareBoxAct::class.java))
        }
        btnColor.setOnClickListener {
            startActivity(Intent(this,ColorAct::class.java))
        }
        btnEka.setOnClickListener {
            startActivity(Intent(this,EkdaAct::class.java))
        }
        btnImage.setOnClickListener {
            startActivity(Intent(this,ImageAct::class.java))
        }
        btnSqure.setOnClickListener {
            startActivity(Intent(this,SqureAct::class.java))
        }
        btnName.setOnClickListener {
            startActivity(Intent(this,NameAct::class.java))
        }
        btnReversed.setOnClickListener {
            startActivity(Intent(this,ReversedEkdaAct::class.java))
        }
        btnTeamIndia.setOnClickListener {
            startActivity(Intent(this,IndiaTeamAct::class.java))
        }
        btnContactNumber.setOnClickListener {
            startActivity(Intent(this,ContectAct::class.java))
        }
        btnFood.setOnClickListener {
            startActivity(Intent(this,FruitsAct::class.java))
        }
        btnNumberSquareCube.setOnClickListener {
            startActivity(Intent(this,NumberSqureCubeAct::class.java))
        }
        btnBox.setOnClickListener {
            startActivity(Intent(this,BoxAct::class.java))
        }
        btnPalindrome.setOnClickListener {
            startActivity(Intent(this,PalindromeAct::class.java))
        }
        btnFactorial.setOnClickListener {
            startActivity(Intent(this,FactorialNumberAct::class.java))
        }
        btnColorText.setOnClickListener {
            startActivity(Intent(this,ColorTextAct::class.java))
        }
        btnTable.setOnClickListener {
            startActivity(Intent(this,TableAct::class.java))
        }
        btnMessage.setOnClickListener {
            startActivity(Intent(this,WhatsAppMainPageAct::class.java))
        }
        btnPractice.setOnClickListener {
            startActivity(Intent(this,PracticeAct::class.java))
        }
    }
}