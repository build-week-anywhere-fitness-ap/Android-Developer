package com.patrickchow.anywherefitness.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.isInvisible
import androidx.core.view.marginBottom
import androidx.recyclerview.widget.RecyclerView
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.model.UsersModel
import kotlinx.android.synthetic.main.layout_trainers_list_item.view.*

class InstructorsRecyclerAdapter(val instructorsList: MutableList<UsersModel>): RecyclerView.Adapter<InstructorsRecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        //Convert the trainers_list_item xml into something usable
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_trainers_list_item,
                parent,
                false
            ) as View
        )
    }

    override fun getItemCount(): Int {
        return instructorsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val instructor = instructorsList[position]
        holder.bindModel(instructor)
        setEnterAnimation(holder.cv_trainers)
    }

    //Show only the cards that are instructors
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ll_list: LinearLayout = view.ll_list_trainer
        val cv_trainers: CardView = view.cv_trainers
        val iv_profile_pic: ImageView = view.iv_profile_picture
        val tv_first_name: TextView = view.tv_first_name
        val tv_last_name: TextView = view.tv_last_name
        val tv_user_name: TextView = view.tv_user_name

        fun bindModel (instructor: UsersModel){
            //If the user is a client, hide the client information
            if(instructor.instructor) {
                iv_profile_pic.setImageResource(instructor.profilePic)
                tv_first_name.setText("First: ${instructor.firstName}")
                tv_last_name.setText("Last: ${instructor.lastName}")
                tv_user_name.setText("Username: ${instructor.userName}")
            }
            //If the user is an instructor, show the instructor's information
            else{
                //Fixes the necessary padding if they're not an instructor.
                //Not having .setPadding would give weird chunks of space
                ll_list.setPadding(0,0,0,0)
                cv_trainers.isInvisible = true
                cv_trainers.layoutParams.height = 0
            }
        }
    }
    fun setEnterAnimation(viewToAnimate: View) {

        val animation: Animation = AnimationUtils.loadAnimation(viewToAnimate.context, R.anim.my_slide_in_right)
        viewToAnimate.startAnimation(animation)
    }
}