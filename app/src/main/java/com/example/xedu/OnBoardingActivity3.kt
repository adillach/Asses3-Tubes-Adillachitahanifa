package com.example.xedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoardingActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding3)
        val btnNextPage = findViewById<Button>(R.id.lanjut3)
        btnNextPage.setOnClickListener {
            val _intent = Intent(this, LoginActivity::class.java)
            startActivity(_intent)
        }
    }
}