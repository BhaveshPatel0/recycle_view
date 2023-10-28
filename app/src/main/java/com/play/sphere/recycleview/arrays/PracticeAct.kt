package com.play.sphere.recycleview.arrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterOddNumber
import java.util.Collections

class PracticeAct : AppCompatActivity() {
    private lateinit var edtNumber: EditText
    private lateinit var edtNumber1: EditText
    private lateinit var btnAns: Button
    private lateinit var rcvOddNumber: RecyclerView
    private lateinit var mAdapterOddNumber: AdapterOddNumber

    val listOfOddNumber = arrayListOf<Int>()
    val listOFLeader = arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)

        listOfOddNumber.add(16)
        listOfOddNumber.add(17)
        listOfOddNumber.add(4)
        listOfOddNumber.add(3)
        listOfOddNumber.add(5)
        listOfOddNumber.add(2)

//        listOfOddNumber.sort()
//        listOfOddNumber.toSet()
//        Collections.rotate(listOfOddNumber,-2)
        bindView()
        bindClick()
    }

    private fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        edtNumber1 = findViewById(R.id.edtNumber1)
        btnAns = findViewById(R.id.btnAns)
        rcvOddNumber = findViewById(R.id.rcvOddNumber)

//        mAdapterOddNumber = AdapterOddNumber(this, listOfOddNumber)
//        listOfOddNumber.sort()
//        listOfOddNumber.max()
//        val a = listOfOddNumber[listOfOddNumber.size - 2]
//        listOfOddNumber.add(a)


        // ****  Duplicate value  ****//
//        val list = listOfOddNumber.toSet()
//        listOfOddNumber.clear()
//
//        list.forEach {
//
//            listOfOddNumber.add(it)
//        }

//        rcvOddNumber.layoutManager = GridLayoutManager(this, 1)
//        rcvOddNumber.adapter = mAdapterOddNumber

    }

    private fun bindClick() {
        btnAns.setOnClickListener {
//            val number = edtNumber.text.toString().toInt()
            mAdapterOddNumber = AdapterOddNumber(this, listOfOddNumber)

            var count = 0
//            listOfOddNumber.forEach {
//                if (it<number){
//                    count = count + 1
//                }
//            }
//            listOfOddNumber.add(count)
//            count=0

            //1 2 3
//            listOfOddNumber.forEachIndexed { index1, i ->
//                listOfOddNumber.forEachIndexed { index, j ->


            //*******   Leaders In Array Method  *********
//            for (i in 0..listOfOddNumber.size - 1) {
//
//                for (j in 0..listOfOddNumber.size - 1) {
//                    if (j >= i) {
//                        if (listOfOddNumber.get(i) >= listOfOddNumber.get(j)) {
//                            if (j == listOfOddNumber.size - 1) {
//                                listOFLeader.add(listOfOddNumber.get(i))
//                            } else {
//                                break
//                            }
//                        }
//                    }
//                }


            // **** Minimum Distance between two number ****//

//
//            val x = edtNumber.text.toString().toInt()
//            val y = edtNumber1.text.toString().toInt()
//
//
//                if (listOfOddNumber.contains(x) && listOfOddNumber.contains(y)) {
//
//                    val x=listOfOddNumber.indexOf(x)
//                    val y=listOfOddNumber.indexOf(y)
//
//                    var ans=x-y
//
//                    if (ans>0){
//                        listOFLeader.add(ans)
//                    }else{
//                        ans *= -1
//                        listOFLeader.add(ans)
//                    }
//                }

            // **** Sorted subsequence of size 3 ****//

            for (i in 0..listOfOddNumber.size - 1) {

                for (j in 0..listOfOddNumber.size-1){
                    if (i<=j){

                    }
                    else if (i>=j){
                        listOFLeader.add(listOfOddNumber[i])
                    }
                    else{
                        break
                    }

                }
                listOFLeader.add(listOfOddNumber[i])
            }


            Log.d("TAG", "bindClick:${listOFLeader} ")
            rcvOddNumber.layoutManager = GridLayoutManager(this, 1)
            rcvOddNumber.adapter = mAdapterOddNumber
        }
    }
}