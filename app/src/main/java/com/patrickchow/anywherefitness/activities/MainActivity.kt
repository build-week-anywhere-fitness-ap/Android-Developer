package com.patrickchow.anywherefitness.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patrickchow.anywherefitness.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Intent to move to the list of trainer details
        btn_trainers.setOnClickListener {
            val trainerIntent = Intent(this, TrainerListActivity::class.java)
            startActivity(trainerIntent)
        }

        //Intent to move to the shopping list details
        btn_pricing.setOnClickListener {
            val pricingIntent = Intent(this, PricingActivity::class.java)
            startActivity(pricingIntent)
        }

        //Intent to move from homescreen to login screen.
        //Not sure if we should actually implement login or not
        btn_login.setOnClickListener {
            val loginIntent = Intent(this, LoginActivity::class.java)
            startActivity(loginIntent)
        }

    }
}
