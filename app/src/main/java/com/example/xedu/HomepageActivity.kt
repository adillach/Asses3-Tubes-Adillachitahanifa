package com.example.xedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        val imageView = findViewById<ImageView>(R.id.book)
        imageView.setOnClickListener {
            val _intent = Intent(this, XeduBelajarActivity::class.java)
            startActivity(_intent)
        }

        val imageView2 = findViewById<ImageView>(R.id.video)
        imageView2.setOnClickListener {
            val _intent = Intent(this, XeduvideoActivity::class.java)
            startActivity(_intent)

        }
        val imageView4 = findViewById<ImageView>(R.id.contact1)
        imageView4.setOnClickListener {
            val _intent = Intent(this, ContactActivity::class.java)
            startActivity(_intent)
        }
        val imageView3 = findViewById<ImageView>(R.id.person1)
        imageView3.setOnClickListener {
            val _intent = Intent(this, profileActivity::class.java)
            startActivity(_intent)

        }
    }
}