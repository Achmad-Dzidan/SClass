package com.example.

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a)

        val back = findViewById<ImageButton>(R.id.btnBack)
//        val bookmark = findViewById<ImageButton>(R.id.btnBookmark)

        back.setOnClickListener {
            val intent = Intent(this, First::class.java)
            startActivity(intent)
            finish()
        }
    }
}