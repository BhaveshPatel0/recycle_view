package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterContact
import com.play.sphere.recycleview.dataclass.DataContact

class ContectAct : AppCompatActivity() {
    lateinit var edtContactNumber:EditText
    lateinit var edtContactName:EditText
    lateinit var btnAddContact:Button
    lateinit var rcvContactNumber:RecyclerView
    lateinit var mAdapterContact: AdapterContact

    private var listOfContect= arrayListOf<DataContact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contect)
        bindView()
        bindClcik()
    }

    private fun bindView() {
        edtContactNumber=findViewById(R.id.edtContactNumber)
        edtContactName=findViewById(R.id.edtContactName)
        btnAddContact=findViewById(R.id.btnAddContact)
        rcvContactNumber=findViewById(R.id.rcvContactNumber)
        mAdapterContact=AdapterContact(this,listOfContect)
    }

    private fun bindClcik() {

        btnAddContact.setOnClickListener {

            val number=edtContactNumber.text.toString().toLong()
            val name=edtContactName.text.toString()

            listOfContect.add(DataContact(name,number))

            rcvContactNumber.layoutManager=GridLayoutManager(this,1)
            rcvContactNumber.adapter=mAdapterContact
        }

    }
}