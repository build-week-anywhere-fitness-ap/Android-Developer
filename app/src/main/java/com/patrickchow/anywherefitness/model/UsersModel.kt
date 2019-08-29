package com.patrickchow.anywherefitness.model

//Data class for the users

data class UsersModel(
    val profilePic: Int,
    val firstName: String,  //first name of the user
    val lastName: String,   //last name of the user
    val userName: String,   //username of the user
    var password: String,   //password of the user
    val client: Boolean = false, //should be set to True if the user is a client
    var instructor: Boolean = false //should be set to True if the user is an instructor
)