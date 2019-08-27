package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patrickchow.anywherefitness.R

/*

    This activity will display all the prices for classes
    This should contain a recyclerview to scroll through the list of classes

 */

class CoursesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        setTitle("Classes Available")
    }
}
