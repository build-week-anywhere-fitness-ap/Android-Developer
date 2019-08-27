package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patrickchow.anywherefitness.R


/*

    This activity will display the list of trainers that work at Anywhere Fitness

 */

class TrainerListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainer_list)
    }
}
