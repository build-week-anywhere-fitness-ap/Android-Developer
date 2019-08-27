package com.patrickchow.anywherefitness.repositories

import com.patrickchow.anywherefitness.model.CoursesModel

//Repository for the courses

class CoursesRepository {
    companion object{
        var coursesList = mutableListOf<CoursesModel>()

    }
}