package com.patrickchow.anywherefitness.model

import java.util.*

data class CoursesModel(
    val courseCategory: String,
    val trainerName: String,
    var location: String,
    var time: String
)