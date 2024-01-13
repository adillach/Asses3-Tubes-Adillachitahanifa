package com.example.xedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DaftarActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar2)
        val btnNextPage = findViewById<Button>(R.id.Daftar)
        btnNextPage.setOnClickListener {
            val _intent = Intent(this, HomepageActivity::class.java)
            startActivity(_intent)
        }
    }
}
