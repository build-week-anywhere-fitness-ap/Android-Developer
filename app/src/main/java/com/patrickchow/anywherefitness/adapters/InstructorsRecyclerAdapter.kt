package com.patrickchow.anywherefitness.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.model.UsersModel
import kotlinx.android.synthetic.main.layout_trainers_list_item.view.*

class InstructorsRecyclerAdapter(val instructorsList: MutableList<UsersModel>): RecyclerView.Adapter<InstructorsRecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
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
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tv_first_name: TextView = view.tv_first_name
        val tv_last_name: TextView = view.tv_last_name
        val tv_user_name: TextView = view.tv_user_name

        fun bindModel (instructor: UsersModel){
            tv_first_name.setText(instructor.firstName)
            tv_last_name.setText(instructor.lastName)
            tv_user_name.setText(instructor.userName)
        }
    }
}