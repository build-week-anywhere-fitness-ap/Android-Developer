package com.patrickchow.anywherefitness.model

//Data class for the courses

data class CoursesModel(
    val id: Int,
    val courseName: String,
    val instructor_id: Int,
    var time: Long,
    val courseCategory: String
)