package com.example.xedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class XeduvideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xeduvideo)
        val imageView = findViewById<ImageView>(R.id.btnback)
        imageView.setOnClickListener {
            val _intent = Intent(this, HomepageActivity::class.java)
            startActivity(_intent)
        }
    }
}