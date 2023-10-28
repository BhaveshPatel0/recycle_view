package com.play.sphere.recycleview.activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterCountClickBox
class ClickCountAct : AppCompatActivity() {
    private lateinit var edtBoxNumber: EditText
    private lateinit var btnBox: Button
    private lateinit var rcvCountClickBox: RecyclerView
    private lateinit var mAdapterCountClickBox: AdapterCountClickBox

    private val listOfCountBox = arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_count)
        bindView()
        bindClick()
    }
    private fun bindView() {
        edtBoxNumber = findViewById(R.id.edtBoxNumber)
        btnBox = findViewById(R.id.btnBox)
        rcvCountClickBox = findViewById(R.id.rcvCountClickBox)
    }
    private fun bindClick() {
        mAdapterCountClickBox = AdapterCountClickBox(this, listOfCountBox)
        btnBox.setOnClickListener {
            listOfCountBox.clear()
            val boxNumber = edtBoxNumber.text.toString().toInt()
            for (row in 1..boxNumber*boxNumber) {
                listOfCountBox.add(row)
            }
            rcvCountClickBox.apply {
                layoutManager = GridLayoutManager(this@ClickCountAct, boxNumber)
                adapter = mAdapterCountClickBox
            }
        }
    }
}