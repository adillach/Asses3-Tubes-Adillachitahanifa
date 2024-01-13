package com.example.xedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoardingActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)
        val btnNextPage = findViewById<Button>(R.id.lanjut2)
        btnNextPage.setOnClickListener {
            val _intent = Intent(this, OnBoardingActivity3::class.java)
            startActivity(_intent)
        }
    }
}