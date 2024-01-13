package com.example.xedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnNextPage1 = findViewById<Button>(R.id.Masuk)
        btnNextPage1.setOnClickListener {
            val _intent = Intent(this, HomepageActivity::class.java)
            startActivity(_intent)
        }

        val btnNextPage2 = findViewById<TextView>(R.id.Buat_akun)
            btnNextPage2.setOnClickListener {
                val _intent = Intent(this, DaftarActivity2::class.java)
                startActivity(_intent)
        }
    }
}