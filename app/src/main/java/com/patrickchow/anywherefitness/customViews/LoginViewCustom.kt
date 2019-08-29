package com.patrickchow.anywherefitness.customViews

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.view.marginTop
import com.patrickchow.anywherefitness.R
import kotlinx.android.synthetic.main.activity_login.view.*

class LoginViewCustom (context: Context, attrs: AttributeSet?): LinearLayout(context, attrs){

    init {

        //Have typedArray hold the data inside of attrs.xml with the declare-styleable name = LoginViewCustom
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.LoginViewCustom)

        val textSize = typedArray.getDimension(R.styleable.LoginViewCustom_textSize, 16f)
        val maxLines = typedArray.getInt(R.styleable.LoginViewCustom_maxLines, 1)
        typedArray.recycle()

        //Create an imageView with a logo. It should be placed on top of the login.
        val logo = ImageView(context)
        logo.setImageResource(R.drawable.af_logo_v3)

        //Create an editTextView to take in the username
        val editViewUser = EditText(context)
        editViewUser.hint = "Username"
        editViewUser.textSize = textSize
        editViewUser.maxLines = maxLines

        //Create an editTextView to take in the password
        val editPassUser = EditText(context)
        editPassUser.hint = "Password"
        editPassUser.textSize = textSize
        editPassUser.maxLines = maxLines

        //Creates empty space between the password and confirm button.
        val emptySpace = TextView(context)
        emptySpace.height = 30

        //Create a button to send data
        val btnConfirmData = Button(context)
        btnConfirmData.setText("Confirm Credentials")
        btnConfirmData.setBackgroundColor(Color.parseColor("#ffc947"))
        btnConfirmData.setOnClickListener {
            userName = editViewUser.text.toString()
            password = editPassUser.text.toString()
        }

        orientation = VERTICAL
        addView(logo)
        addView(editViewUser)
        addView(editPassUser)
        addView(emptySpace)
        addView(btnConfirmData)
    }

    companion object{
        var userName = ""
        var password = ""
    }
}