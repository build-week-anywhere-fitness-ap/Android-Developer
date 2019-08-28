package com.patrickchow.anywherefitness.repositories

import com.patrickchow.anywherefitness.data.*
import com.patrickchow.anywherefitness.model.PassesModel

class PassesRepository {
    companion object{
        var passesList = mutableListOf<PassesModel>()
        fun createPassessList(){
            for(index in 0 until pass_id.size){
                passesList.add(PassesModel(pass_id[index], client_id[index], class_id[index],
                                            timesUsed[index], completed[index]))
            }
        }
    }
}