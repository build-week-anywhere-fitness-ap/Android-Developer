package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.patrickchow.anywherefitness.R
import kotlinx.android.synthetic.main.activity_login.*

/*

    ***NOT SURE IF WE SHOULD ACTUALLY IMPLEMENT THIS OR NOT YET***
    This activity will display the login screen

 */

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setTitle("Login")

        btn_sign_in.setOnClickListener {
            toastMe("Patrick")
            finish()
        }

        btn_cancel.setOnClickListener {
            finish()
        }
    }

    fun toastMe(name: String){
        val welcomeToast = Toast.makeText(this, "Welcome $name", Toast.LENGTH_SHORT)
        welcomeToast.setGravity(0,0,0)
        welcomeToast.show()
    }
}
