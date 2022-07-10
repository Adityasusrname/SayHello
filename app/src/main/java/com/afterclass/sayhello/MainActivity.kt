package com.afterclass.sayhello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etName=findViewById<EditText>(R.id.etName)
        var btnSubmit=findViewById<Button>(R.id.btnSubmit)



        btnSubmit.setOnClickListener {

            val name=etName.text.toString()
            val intent=Intent(this,SecondActivity::class.java).putExtra("Name",name)

            startActivity(intent)

        }




    }
}