package com.patrickchow.anywherefitness.data

/*
Data for the passes are
data class PassesModel(
    val pass_id: Int,    //The id of the pass
    val client_id: Int, //The client that the pass belongs to
    val class_id: Int, //The class the pass is for
    var timesUsed: Int, //How many times the pass has been used
    var completed: Boolean = false //Denotes if the pass is used up
)
 */

val pass_id = arrayOf(
    20,
    34,
    61,
    82,
    92,
    112
)

val client_id = arrayOf(
    536,
    748,
    986,
    1005,
    1221,
    1533
)

val class_id = arrayOf(
    101,
    102,
    103,
    104,
    105,
    106
)

val timesUsed = arrayOf(
    5,
    6,
    99,
    2,
    1,
    0
)

val completed = arrayOf(
    false,
    false,
    true,
    false,
    true,
    false
)