package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterPalindrome

class PalindromeCheckAct : AppCompatActivity() {
    private lateinit var rcvPalindrome:RecyclerView
    private lateinit var mAdapterPalindrome: AdapterPalindrome

    val listOfNumber= arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindrome_check)
        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvPalindrome=findViewById(R.id.rcvPalindrome)
        mAdapterPalindrome= AdapterPalindrome(this,listOfNumber)

        val num=intent.getIntExtra("number",0)

        for (palindrome in 1..num){

            listOfNumber.add(palindrome)

        }

        rcvPalindrome.layoutManager=GridLayoutManager(this,1)
        rcvPalindrome.adapter=mAdapterPalindrome
    }

    private fun bindClick() {

    }
}