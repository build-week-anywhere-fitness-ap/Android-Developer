package com.patrickchow.anywherefitness.repositories

import com.patrickchow.anywherefitness.model.CoursesModel

//Repository for the courses

class CoursesRepository {
    companion object{
        //Create a mutableList and add a single sample object to it.
        val coursesList = mutableListOf<CoursesModel>(
            CoursesModel("Test Category", "Test Name",
                          "Test Location", "Test Time")
        )
    }
}