package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.customViews.LoginViewCustom
import com.patrickchow.anywherefitness.repositories.UsersRepository
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
            for(index in 0 until UsersRepository.usersList.size) {
                if((LoginViewCustom.userName == UsersRepository.usersList[index].userName) && (LoginViewCustom.password == UsersRepository.usersList[index].password)) {
                    welcomeToast(LoginViewCustom.userName)
                    isLoggedIn = true
                    finish()
                }
            }
            if(isLoggedIn == false)
                errorToast()
        }
    }

    // A toast to welcome the user upon signing in.
    fun welcomeToast(name: String){
        val welcomeToast = Toast.makeText(this, "Welcome $name", Toast.LENGTH_SHORT)

        //Makes the toast appear in the middle of the screen
        welcomeToast.setGravity(0,0,0)
        welcomeToast.show()
    }

    fun errorToast(){
        val welcomeToast = Toast.makeText(this, "Either wrong name or password entered", Toast.LENGTH_SHORT)
        welcomeToast.show()
    }

    companion object{
        var isLoggedIn = false
    }
}
