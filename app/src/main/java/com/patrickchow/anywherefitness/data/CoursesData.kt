package com.patrickchow.anywherefitness.data

import java.sql.Timestamp

/*
Data for the courses
    val id: Int,    //Id for the course
    val courseName: String,     //Name of the course
    val instructor_id: Int,     //Instructor's Id
    var time: Long,     //The time of the course
 */

val courseId = arrayOf(
    101,
    102,
    103,
    104,
    105,
    106
)

val courseName = arrayOf(
    "Yoga",
    "Dance",
    "Cycling",
    "Strength Training",
    "Pilates",
    "Barre"
)

val instructor_id = arrayOf(
    1,
    2,
    3,
    4,
    5,
    6
)

val time = arrayOf(
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time,
    Timestamp(System.currentTimeMillis()).time
)