package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.model.UsersModel
import com.patrickchow.anywherefitness.repositories.UsersRepository
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        //Registers the new user
        btn_register.setOnClickListener {

            var emptyText = false
            if(et_user_name.text.toString() == "" || et_first_name.text.toString() == "" || et_last_name.text.toString() == "" || et_password.text.toString() == ""){
                emptyText = true
            }

            var alreadyExistUsername = false
            //Check to see if the username is already taken
            for (index in 0 until UsersRepository.usersList.size) {
                if (et_user_name.toString() == UsersRepository.usersList[index].userName)
                    alreadyExistUsername = true
            }

            //If the username is already taken, prevent the registration
            if (alreadyExistUsername) {
                Toast.makeText(this, "That username is already taken", Toast.LENGTH_SHORT).show()
            }else if(emptyText){
                Toast.makeText(this, "Please enter data in all the fields", Toast.LENGTH_SHORT).show()
            }

            //If the username isn't taken, register the new account
            else {
                UsersRepository.usersList.add(
                    0, UsersModel(
                        R.drawable.default_profile_picture,
                        et_first_name.text.toString(),
                        et_last_name.text.toString(),
                        et_user_name.text.toString(),
                        et_password.text.toString()
                    )
                )

                Log.i(
                    "${UsersRepository.usersList[UsersRepository.usersList.size - 1].userName}",
                    "Testing"
                )
                Toast.makeText(this, "You have successfully registered", Toast.LENGTH_SHORT).show()
                finish()
            }

            btn_cancel_register.setOnClickListener {
                finish()
            }

        }
    }
}
