package com.patrickchow.anywherefitness.repositories

import android.media.Image
import com.patrickchow.anywherefitness.data.*
import com.patrickchow.anywherefitness.model.CoursesModel

//Repository for the courses

class CoursesRepository {
    companion object{
        var coursesList = mutableListOf<CoursesModel>()
        fun createCoursesList(){
            for(index in 0 until courseIdArray.size){
                coursesList.add(CoursesModel(courseIdArray[index], courseNameArray[index],
                                            instructor_idArray[index], timeArray[index], imageArray[index]))
            }
        }
    }
}
