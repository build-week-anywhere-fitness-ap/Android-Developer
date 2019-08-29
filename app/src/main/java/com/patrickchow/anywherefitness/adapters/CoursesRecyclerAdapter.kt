package com.patrickchow.anywherefitness.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.model.CoursesModel
import kotlinx.android.synthetic.main.layout_courses_list_item.view.*

class CoursesRecyclerAdapter(val coursesList:MutableList<CoursesModel>):RecyclerView.Adapter<CoursesRecyclerAdapter.ViewHolder>(){

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
        holder.bindModel(course)

        setEnterAnimation(holder.card)
    }


    class ViewHolder (view: View): RecyclerView.ViewHolder(view){

        //Get hold of the views that are in layout_courses_list_item.xml
        val card : CardView = view.cv_holder
        val courses_id : TextView = view.tv_id
        val courses_name : TextView= view.tv_course_name
        val courses_instructor_id : TextView= view.tv_instructor
        val courses_time :TextView = view.tv_time

        //Convert the views' data depending on what the course model contains
        fun bindModel (coursesModel: CoursesModel){
            //Convert the id(int) into a string first before applying it to setText
            val courseIdToString = coursesModel.id.toString()
            courses_id.setText(courseIdToString)

            //Don't have to do any conversion here because courseName is already a string
            courses_name.setText(coursesModel.courseName)

            //Convert the instructor id(int) into a string first before applying it to setText
            val instructorIdToString = coursesModel.instructor_id.toString()
            courses_instructor_id.setText(instructorIdToString)

            //Convert the time(long) into a string first before applying it to setText
            val timeToString = coursesModel.time.toString()
            courses_time.setText(timeToString)
        }
    }

    fun setEnterAnimation(viewToAnimate: View) {

        val animation: Animation = AnimationUtils.loadAnimation(viewToAnimate.context, R.anim.abc_fade_in)
        viewToAnimate.startAnimation(animation)
    }
}