package com.example.usersp

data class User(val id: Long, var name: String, val lasName: String, var url: String){

    fun getFullName(): String{

        return "$name $lasName"
    }
}
