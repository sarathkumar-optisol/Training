package com.example.training.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import com.example.training.User

val DATABASE_NAME = "MyDB"
val TABLE_NAME = "Users"
val COL_NAME = "name"
val COL_AGE = "age"
val COL_ID = "ID"

class DatabaseHandler(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {

        val createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COL_NAME + " VARCHAR(256)," +
                COL_AGE +" INTEGER)"

        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    fun insertData(user: UserData){
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(COL_NAME,user.name)
        cv.put(COL_AGE,user.age)

        val result = db.insert(TABLE_NAME,null,cv,)

        if (result == -1.toLong()){
            Toast.makeText(context,"Failed", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Success", Toast.LENGTH_LONG).show()
        }
    }

}