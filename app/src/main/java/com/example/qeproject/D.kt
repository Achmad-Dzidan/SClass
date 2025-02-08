package com.example.qeproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class D: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.d)

        val back = findViewById<ImageButton>(R.id.btnBack)
//        val bookmark = findViewById<ImageButton>(R.id.btnBookmark)

        back.setOnClickListener {
            val intent = Intent(this, User::class.java)
            startActivity(intent)
            finish()
        }
    }
}