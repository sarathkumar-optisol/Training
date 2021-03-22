package com.example.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.training.model.DatabaseHandler
import com.example.training.model.UserData


class Database : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)

        val context = this

        val database = findViewById<Button>(R.id.btnInsertRLMData)
        val name = findViewById<EditText>(R.id.etName)
        val age = findViewById<EditText>(R.id.etAge)

        database.setOnClickListener {
            var user = UserData(name.toString(), age.text.toString().toInt())
            var db = DatabaseHandler(context)

            db.insertData(user)
        }


    }
}