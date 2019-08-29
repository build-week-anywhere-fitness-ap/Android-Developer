package com.patrickchow.anywherefitness.data

import com.patrickchow.anywherefitness.R
import java.sql.Timestamp

/*
Data for the courses
    val id: Int,    //Id for the course
    val courseName: String,     //Name of the course
    val instructor_id: Int,     //Instructor's Id
    var time: Long,     //The time of the course
 */

val courseIdArray = arrayOf(
    101,
    102,
    103,
    104,
    105,
    106
)

val courseNameArray = arrayOf(
    "Yoga",
    "Dance",
    "Cycling",
    "Strength Training",
    "Pilates",
    "Barre"
)

val instructor_idArray = arrayOf(
    1,
    2,
    3,
    4,
    5,
    6
)

val timeArray = arrayOf(
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time
)

val imageArray = arrayOf(
    R.drawable.yoga2,
    R.drawable.dance2,
    R.drawable.cycleing2,
    R.drawable.strength_training2,
    R.drawable.pilates2,
    R.drawable.barrev2

)