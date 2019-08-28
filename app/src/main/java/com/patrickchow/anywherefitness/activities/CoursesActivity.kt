package com.patrickchow.anywherefitness.activities

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

        CoursesRepository.createCoursesList()

        rv_courses.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@CoursesActivity)
            adapter = CoursesRecyclerAdapter(CoursesRepository.coursesList)
        }
    }
}
