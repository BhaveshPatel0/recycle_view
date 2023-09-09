package com.play.sphere.recycleview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.dataclass.DataContact

class ContactInfoAct : AppCompatActivity() {
    private lateinit var tvContactName: TextView
    private lateinit var tvContactNumber: TextView
    private lateinit var selectedContact: DataContact
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_info)

        intent.extras?.let {
            selectedContact = it.get("selectContact") as DataContact
        }

        bindView()
        bindClick()
    }

    private fun bindView() {
        tvContactName = findViewById(R.id.tvContactName)
        tvContactNumber = findViewById(R.id.tvContactNumber)

        tvContactName.setText(selectedContact.contactName)
        tvContactNumber.setText(selectedContact.contactNumber.toString())

    }

    private fun bindClick() {

    }
}