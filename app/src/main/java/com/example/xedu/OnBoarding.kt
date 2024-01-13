package com.example.xedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class OnBoarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        val btnNextPage = findViewById<Button>(R.id.lanjut)
        btnNextPage.setOnClickListener {
            val _intent = Intent(this, OnBoardingActivity2::class.java)
            startActivity(_intent)
        }
    }
}