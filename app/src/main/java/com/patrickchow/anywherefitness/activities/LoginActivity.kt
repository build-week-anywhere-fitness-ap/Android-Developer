package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.patrickchow.anywherefitness.R
import kotlinx.android.synthetic.main.activity_login.*

/*
    Displays the Login
 */

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setTitle("Login")

        btn_sign_in.setOnClickListener {
            toastMe("")
            finish()
        }

        btn_cancel.setOnClickListener {
            finish()
        }
    }

    // A toast to welcome the user upon signing in.
    fun toastMe(name: String){
        val welcomeToast = Toast.makeText(this, "Welcome $name", Toast.LENGTH_SHORT)

        //Makes the toast appear in the middle of the screen
        welcomeToast.setGravity(0,0,0)
        welcomeToast.show()
    }
}
