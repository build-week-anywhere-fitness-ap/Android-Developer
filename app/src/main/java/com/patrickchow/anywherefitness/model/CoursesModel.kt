package com.patrickchow.anywherefitness.model

//Data class for the courses

data class CoursesModel(
    val courseCategory: String,
    val trainerName: String,
    var location: String,
    var time: String
)