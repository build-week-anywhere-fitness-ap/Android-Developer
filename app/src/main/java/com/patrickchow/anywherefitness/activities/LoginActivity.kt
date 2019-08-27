package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patrickchow.anywherefitness.R

/*

    ***NOT SURE IF WE SHOULD ACTUALLY IMPLEMENT THIS OR NOT YET***
    This activity will display the login screen

 */

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
