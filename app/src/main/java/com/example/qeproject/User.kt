package com.example.qeproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.cardview.widget.CardView


class User : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first)

        val back = findViewById<ImageButton>(R.id.btnBack)
        val cardView = findViewById<CardView>(R.id.cardView)

        cardView.setOnClickListener {
            val intent = Intent(this, A::class.java)
            startActivity(intent)
        }

        val cardView1 = findViewById<CardView>(R.id.cardView2)

        cardView1.setOnClickListener {
            val intent = Intent(this, B::class.java)
            startActivity(intent)
        }

        val cardView2 = findViewById<CardView>(R.id.cardView3)

        cardView2.setOnClickListener {
            val intent = Intent(this, C::class.java)
            startActivity(intent)
        }

        val cardView3 = findViewById<CardView>(R.id.cardView4)

        cardView3.setOnClickListener {
            val intent = Intent(this, D::class.java)
            startActivity(intent)
        }

        val cardView4 = findViewById<CardView>(R.id.cardView5)

        cardView4.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }

        val cardView5 = findViewById<CardView>(R.id.cardView6)

        cardView5.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }

        val cardView6 = findViewById<CardView>(R.id.cardView7)

        cardView6.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }

        val cardView7 = findViewById<CardView>(R.id.cardView8)

        cardView7.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }


        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}