package com.patrickchow.anywherefitness.repositories

import com.patrickchow.anywherefitness.model.PassesModel

class PassesRepository {
    companion object{
        var coursesList = mutableListOf<PassesModel>()
    }
}