package com.afterclass.sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activity)

        val name=intent.getStringExtra("Name")

        val tvMessage=findViewById<TextView>(R.id.tvMessage)

        tvMessage.text="Hello,${name}"


    }
}