package com.example.training.model

import com.google.gson.annotations.SerializedName

data class UserData (
    @SerializedName("name")
    val name : String,
    @SerializedName("age")
    val age : Int

        )