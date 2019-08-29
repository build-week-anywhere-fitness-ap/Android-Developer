package com.patrickchow.anywherefitness.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.adapters.CoursesRecyclerAdapter
import com.patrickchow.anywherefitness.model.CoursesModel
import com.patrickchow.anywherefitness.repositories.CoursesRepository
import kotlinx.android.synthetic.main.activity_courses.*

/*

    This activity will display all the prices for classes
    This should contain a recyclerview to scroll through the list of classes

 */

class CoursesActivity : AppCompatActivity() {

    private lateinit var coursesAdapter: CoursesRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        setTitle("Classes Available")

        //Used to get CoursesActivity Context so that a Toast/Alert Dialog can be run
        val context = this

        rv_courses.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@CoursesActivity)

            //A context is needed because i wanted a Toast/Alert Dialog to be shown
            adapter = CoursesRecyclerAdapter(context, CoursesRepository.coursesList)
        }
    }
}
