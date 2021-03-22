package com.example.training

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.lang.StringBuilder

class FileSystem : AppCompatActivity() {

    val filename = "file.txt"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file_system)

        val fileSystem = findViewById<EditText>(R.id.etFileContent)
        val file = findViewById<TextView>(R.id.tvFileContent)
        val save = findViewById<Button>(R.id.btnFileSystem)



//        save.setOnClickListener {
//            val outputStream:FileOutputStream
//
//            try
//            {
//                outputStream = openFileOutput(filename, Context.MODE_PRIVATE)
//                Log.d("File","${fileSystem.text.toString()}")
//                outputStream.write(fileSystem.toString().toByteArray())
//                Log.d("File","${fileSystem.text.toString()}")
//                outputStream.close()
//            }
//            catch (e:Exception) {
//                e.printStackTrace()
//            }
//
//
//            //read
//
//
//            val inputStream : FileInputStream
//            inputStream = openFileInput(filename)
//            val inputStreamReader = InputStreamReader(inputStream)
//            val bufferedReader = BufferedReader(inputStreamReader)
//            var stringBuilder = StringBuilder()
//            var text : String
//
//            text = bufferedReader.readLine().toString()
//
//
//                Log.d("File","Outside while")
//
//                stringBuilder.append(text).append("\n")
//
//                file.text = stringBuilder.toString()
//
//                Log.d("File","$stringBuilder")
//
//
//
//
//        }




    }






}

//            text = fileSystem.text.toString()
//text = bufferedReader.readLine()