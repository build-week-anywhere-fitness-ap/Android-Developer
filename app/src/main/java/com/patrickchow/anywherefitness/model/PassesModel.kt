package com.patrickchow.anywherefitness.model
/*
    What is PunchPass?
    Punchpass is software for fitness, dance, yoga studios and independent instructors.
    Manage your customers, take attendance, and track passes. Accept reservations and
    sell passes online too. Manage personal training, events, and track waivers online.
    Punchpass is easy to use - you'll be in control and feeling great right away. It's
    simple, flexible, and awesome. See why our customers love us & start a free trial today!
    We're a small business like you, and we're known for great support.
 */

data class PassesModel(
    val id: Int,    //The id of the pass
    val client_id: Int, //The client that the pass belongs to
    val class_id: Int, //The class the pass is for
    var timesUsed: Int, //How many times the pass has been used
    var completed: Boolean = false //Denotes if the pass is used up
)