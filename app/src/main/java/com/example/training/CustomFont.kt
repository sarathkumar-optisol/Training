package com.example.training

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.gson.Gson

class CustomFont : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_font)





        var customDrawable = findViewById<ImageView>(R.id.ivEmail)
        var tv1 = findViewById<TextView>(R.id.textView2)
        var tv2 = findViewById<TextView>(R.id.textview3)

        val gson = Gson()
        val user = User("sarath",1)
        val json = gson.toJson(user)

        val data = gson.fromJson(json,User::class.java)
        tv1.text=data.id.toString()
        tv2.text = data.name


        customDrawable.setOnClickListener {
            Toast.makeText(this,"Imageview Clicked ", Toast.LENGTH_LONG).show()
            customDrawable.setImageResource(R.drawable.paperplane)


        }
    }
}