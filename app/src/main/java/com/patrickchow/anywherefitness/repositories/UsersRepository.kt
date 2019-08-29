package com.patrickchow.anywherefitness.repositories

import com.patrickchow.anywherefitness.model.UsersModel
import com.patrickchow.anywherefitness.data.*

//Repository for the users

class UsersRepository {
    companion object{
        //Create a mutableList and add a sample object to it.
        var usersList = mutableListOf<UsersModel>()
        fun createUsersList(){
            for(index in 0 until firstName.size){
                usersList.add(UsersModel(profilePic[index],firstName[index], secondName[index], userName[index],
                                         passWord[index], client[index], instructor[index]))
                }
        }
    }
}