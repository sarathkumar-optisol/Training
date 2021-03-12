package com.example.training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnCustomStyle)

        btn.setOnClickListener {
            val intent = Intent(this, CustomStyleForViews::class.java)
            startActivity(intent)
        }
    }
}