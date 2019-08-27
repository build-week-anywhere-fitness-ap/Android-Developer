package com.patrickchow.anywherefitness.model

//Data class for the users

data class UsersModel(
    val firstName: String,
    val lastName: String,
    val emailAddress: String,
    var password: String,
    var typeOfUser: String
)