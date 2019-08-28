package com.patrickchow.anywherefitness.model

data class PassesModel(
    val id: Int,    //The id of the pass
    val client_id: Int, //The client that the pass belongs to
    val class_id: Int, //The class the pass is for
    var timesUsed: Int, //How many times the pass has been used
    var completed: Boolean = false //Denotes if the pass is used up
)