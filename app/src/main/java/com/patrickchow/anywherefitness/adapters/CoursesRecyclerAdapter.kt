package com.patrickchow.anywherefitness.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.activities.LoginActivity
import com.patrickchow.anywherefitness.activities.RegisteredCoursesActivity
import com.patrickchow.anywherefitness.model.CoursesModel
import kotlinx.android.synthetic.main.layout_courses_list_item.view.*

//Added a context here so that a Toast/Alert Dialog can run. Normally, a context valuable wouldn't be passed in an adapter.
class CoursesRecyclerAdapter(val context: Context, val coursesList:MutableList<CoursesModel>):RecyclerView.Adapter<CoursesRecyclerAdapter.ViewHolder>(){

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
        holder.bindModel(context, course)
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
        fun bindModel (context: Context, coursesModel: CoursesModel){

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

            //When a user clicks on a button to register for, the registered class is put into the list
            courses_register.setOnClickListener {
                if(LoginActivity.isLoggedIn == false){
                    makeToast(context)
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
    fun makeToast(context: Context) {
        val toast = Toast.makeText(context, "mistake", Toast.LENGTH_SHORT)
        toast.show()
}