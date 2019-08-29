package com.patrickchow.anywherefitness.adapters

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.activities.CoursesActivity
import com.patrickchow.anywherefitness.activities.LoginActivity
import com.patrickchow.anywherefitness.activities.RegisteredCoursesActivity
import com.patrickchow.anywherefitness.model.CoursesModel
import kotlinx.android.synthetic.main.layout_courses_list_item.view.*

//Added a context here so that a Toast/Alert Dialog can run. Normally, a context valuable wouldn't be passed in an adapter.
//Added a show here because I wanted a toggle to switch between the register button showing up in the Courses and not showing up in the Registered Courses
class CoursesRecyclerAdapter(val context: Context, val show: Boolean, val coursesList:MutableList<CoursesModel>):RecyclerView.Adapter<CoursesRecyclerAdapter.ViewHolder>(){

    //Converts the layout_courses_list_item xml into a view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_courses_list_item, parent, false) as View
        )
    }

    override fun getItemCount(): Int {
        return coursesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = coursesList[position]
        holder.bindModel(context, show, course)
        setEnterAnimation(holder.card)
    }

    class ViewHolder (view: View): RecyclerView.ViewHolder(view){

        //Get hold of the views that are in layout_courses_list_item.xml
        val courses_image: ImageView = view.iv_course
        val card : CardView = view.cv_holder
        //val courses_id : TextView = view.tv_id
        val courses_name : TextView= view.tv_course_name
        val courses_benefits: TextView = view.tv_course_benefits
        val courses_instructor_id : TextView= view.tv_instructor
        val courses_time :TextView = view.tv_time
        val courses_register: ImageView = view.iv_register

        //Convert the views' data depending on what the course model contains
        //Added a context here so that a Toast/Alert Dialog can be run
        fun bindModel (context: Context, show: Boolean, coursesModel: CoursesModel){

            //Sets the image of the course
            courses_image.setImageResource(coursesModel.image)

            //Convert the id(int) into a string first before applying it to setText
            //val courseIdToString = coursesModel.id.toString()
            //courses_id.setText(courseIdToString)

            //Don't have to do any conversion here because courseName is already a string
            courses_name.setText(coursesModel.courseName)

            //Sets the benefits of the course
            courses_benefits.setText(coursesModel.benefits)

            //Convert the instructor id(int) into a string first before applying it to setText
            val instructorIdToString = "Course ID: ${coursesModel.instructor_id.toString()}"
            courses_instructor_id.setText(instructorIdToString)

            //Sets the time of the course
            courses_time.setText(coursesModel.time)

            if(!show)
                courses_register.visibility = ImageView.INVISIBLE

            //When a user clicks on a button to register for, the registered class is put into the list
            courses_register.setOnClickListener {
                if(LoginActivity.isLoggedIn == false){

                    //Display a toast telling the user the log in first
                    loginToast(context)
                }

                else{
                    //Display a toast telling the user they have successfully registered for the course
                    addedToast(context, coursesModel.courseName, coursesModel.time)
                    RegisteredCoursesActivity.registeredCourses.add(CoursesModel(coursesModel.id, coursesModel.courseName, coursesModel.benefits,
                        coursesModel.instructor_id, coursesModel.time, coursesModel.image))
                    }
                }
            }
        }
    }
    fun setEnterAnimation(viewToAnimate: View) {
        val animation: Animation = AnimationUtils.loadAnimation(viewToAnimate.context, R.anim.abc_fade_in)
        viewToAnimate.startAnimation(animation)
    }

    //If the user isn't logged in, show a message asking the user to log in.
    fun loginToast(context: Context) {
        val toast = Toast.makeText(context, "Please Login first before registering for a class", Toast.LENGTH_SHORT)
        toast.show()
    }

    //If the user is logged in, show a message that the user has registered for the course
    fun addedToast(context: Context, courseName: String, courseTime: String){
        val toast = Toast.makeText(context, "You have successfully registered for the course $courseName\n" +
                                                 "See you on the $courseTime", Toast.LENGTH_LONG)
        toast.show()
    }