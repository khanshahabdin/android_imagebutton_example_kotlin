package com.example.exm1button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgbtn1: ImageButton = findViewById(R.id.imageButton1)
        val textv: TextView = findViewById(R.id.textview1)
        imgbtn1.setOnClickListener {
            imgbtn1.setImageResource(R.drawable.btn1bgimg2)
            textv.text="Long Click"
        }
        imgbtn1.setOnLongClickListener {
            imgbtn1.setImageResource(R.drawable.btn1bgimg3)
            textv.text="Click"
            true
        }
        
    }
}