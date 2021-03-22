package com.example.training.model


import io.realm.RealmObject


open class DataModel(
    var id : Int = 0,
    var name : String = "",
    var email : String = ""
) : RealmObject()