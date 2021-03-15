package com.example.training

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi

class CustomFont : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_font)

        var customDrawable = findViewById<ImageView>(R.id.ivEmail)
        customDrawable.setOnClickListener {
            Toast.makeText(this,"Imageview Clicked ", Toast.LENGTH_LONG).show()
            customDrawable.setImageResource(R.drawable.paperplane)
        }
    }
}