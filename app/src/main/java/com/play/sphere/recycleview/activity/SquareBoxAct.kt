package com.play.sphere.recycleview.activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterSquareBox
import com.play.sphere.recycleview.dataclass.DataBox
import kotlin.math.log

class SquareBoxAct : AppCompatActivity() {
    private lateinit var edtNumber: EditText
    private lateinit var btnAddNumber: Button
    private lateinit var rcvSquareBox: RecyclerView
    private lateinit var mAdapterSquareBoxAct: AdapterSquareBox

    val listOfSquare = arrayListOf<DataBox>()
//    val listOfBox= arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_box)
        bindView()
        bindClick()
    }
    private fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        rcvSquareBox = findViewById(R.id.rcvSquareBox)

    }
    private fun bindClick() {
        btnAddNumber.setOnClickListener {

            val number = edtNumber.text.toString().toInt()
            if (5 <= number && 10 >= number) {
                for (row in 0..number-1) {
                    for (colume in 0..number-1) {
                        listOfSquare.add(DataBox(row,colume))
                    }
                }
                mAdapterSquareBoxAct=AdapterSquareBox(this,listOfSquare)
                rcvSquareBox.apply {
                    layoutManager=GridLayoutManager(this@SquareBoxAct,number)
                    adapter=mAdapterSquareBoxAct
                }
            }
            else {
                Toast.makeText(this, "Please Enter Number Between 5 to 10 ", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}