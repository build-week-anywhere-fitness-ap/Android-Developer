package com.patrickchow.anywherefitness.repositories

import com.patrickchow.anywherefitness.model.UsersModel

//Repository for the users

class UsersRepository {
    companion object{
        //Create a mutableList and add a sample object to it.
        var usersList = mutableListOf<UsersModel>()
    }
}