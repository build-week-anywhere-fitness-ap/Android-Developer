package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.adapters.CoursesRecyclerAdapter
import com.patrickchow.anywherefitness.model.CoursesModel
import kotlinx.android.synthetic.main.activity_courses.*
import kotlinx.android.synthetic.main.activity_registered_courses.*

class RegisteredCoursesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registered_courses)

        rv_registered_courses.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@RegisteredCoursesActivity)
            adapter = CoursesRecyclerAdapter(registeredCourses)
        }
    }

    companion object{
        var registeredCourses = mutableListOf<CoursesModel>()
    }
}
