package com.example.training

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("name")
    val name : String,
    @SerializedName("id")
    val id : Int
)