package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.adapters.InstructorsRecyclerAdapter
import com.patrickchow.anywherefitness.repositories.UsersRepository
import kotlinx.android.synthetic.main.activity_trainer_list.*


/*

    This activity will display the list of trainers that work at Anywhere Fitness
    This should contain a recyclerview to scroll through a list of trainers

 */

class TrainerListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainer_list)

        setTitle("Trainer Details ")

        rv_instructors.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@TrainerListActivity)
            adapter = InstructorsRecyclerAdapter(UsersRepository.usersList)
        }
    }
}
