package com.example.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.training.model.DataModel
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_database.*
import kotlinx.android.synthetic.main.activity_realm.*
import java.lang.Exception

class RealmActivity : AppCompatActivity() {

     lateinit var  realm : Realm

    var  datamodel = DataModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realm)


        var namrlmdata = findViewById<EditText>(R.id.etRLMName)
        var agerlmdata = findViewById<EditText>(R.id.etAge)
        var numberrlmdata = findViewById<EditText>(R.id.etRlmNumber)

        realm = Realm.getDefaultInstance()

        val insert = findViewById<Button>(R.id.btnInsertRLMData)



        insert.setOnClickListener {
            try{
                Log.d("realm","${datamodel.id}")
                Log.d("realm","${datamodel.name}")
                Log.d("realm","${datamodel.email}")



                datamodel.id = agerlmdata!!.text.toString().toInt()
                datamodel.name = namrlmdata!!.text.toString()
                datamodel.email = numberrlmdata!!.text.toString()

                Log.d("realm","AFTER")
                Log.d("realm","${datamodel.email}")
                Log.d("realm","${datamodel.name}")
                Log.d("realm","${datamodel.id}")

                realm!!.executeTransaction{ realm -> realm.copyFromRealm(datamodel)}


            }catch (e: Exception){
            }
        }

    }



}