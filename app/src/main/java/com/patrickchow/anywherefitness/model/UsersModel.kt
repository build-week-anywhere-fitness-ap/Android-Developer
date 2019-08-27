package com.patrickchow.anywherefitness.model

//Data class for the users

data class UsersModel(
    val firstName: String,
    val lastName: String,
    val userName: String,
    var password: String,
    val client: Boolean = false, //should be set to True if the user is a client
    var instructor: Boolean = false //should be set to True if the user is an instructor
)