package com.example.training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customStyle = findViewById<Button>(R.id.btnCustomStyle)
        val customShape = findViewById<Button>(R.id.btnCustomShape)
        val customShape2 = findViewById<Button>(R.id.btnCustomShape2)
        val customFont = findViewById<Button>(R.id.btnCustomFont)
        val fileSystembtn = findViewById<Button>(R.id.btnFilkeSystemButton)
        val db = findViewById<Button>(R.id.btnDb)
        val realmDatabase = findViewById<Button>(R.id.btnRealmDatabase)

        customStyle.setOnClickListener {
            val intent = Intent(this, CustomStyleForViews::class.java)
            startActivity(intent)
        }

        customShape.setOnClickListener {
            val intent = Intent(this, CustomShapes::class.java)
            startActivity(intent)
        }
        customShape2.setOnClickListener {
            val intent = Intent(this, CustomShapes2::class.java)
            startActivity(intent)
        }
        customFont.setOnClickListener {
            val intent = Intent(this, CustomFont::class.java)
            startActivity(intent)
        }
        fileSystembtn.setOnClickListener {
            val intent = Intent(this, FileSystem::class.java)
            startActivity(intent)
        }
        realmDatabase.setOnClickListener {
            val intent = Intent(this,RealmActivity::class.java)
            startActivity(intent)
        }


        db.setOnClickListener {
            val intent = Intent(this,Database::class.java)
            startActivity(intent)
        }


    }
}