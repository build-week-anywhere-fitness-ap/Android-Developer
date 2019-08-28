package com.patrickchow.anywherefitness.activities

import android.content.Intent
import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.repositories.CoursesRepository
import com.patrickchow.anywherefitness.repositories.PassesRepository
import com.patrickchow.anywherefitness.repositories.UsersRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoursesRepository.createCoursesList()
        PassesRepository.createPassessList()

        Log.i("${UsersRepository.usersList}", "Test")

        //Animates the getting_swole gif
        animateGif(R.drawable.getting_swole, iv_gettingSwole)

        //Allows the user to share the official Fitness Anywhere website
        iv_share.setOnClickListener {
            mainWebpageShare()
        }

        //Intent to move to the list of trainer details
        btn_trainers.setOnClickListener {
            val trainerIntent = Intent(this, TrainerListActivity::class.java)
            startActivity(trainerIntent)
        }

        //Intent to move to the shopping list details
        btn_courses.setOnClickListener {
            val pricingIntent = Intent(this, CoursesActivity::class.java)
            startActivity(pricingIntent)
        }

        //Intent to move to the Login Screen
        //Not sure if we should actually implement login or not
        btn_sign_in.setOnClickListener {
            val loginIntent = Intent(this, LoginActivity::class.java)
            startActivity(loginIntent)
        }
    }

    //Gives the share button functionality to message someone a link to the official Anywhere Fitness website
    fun mainWebpageShare(){
        val webpageShareIntent = Intent()
        webpageShareIntent.action = Intent.ACTION_SEND
        webpageShareIntent.putExtra(Intent.EXTRA_TEXT,
            """
                https://anywherefitness-08-2019.netlify.com/
                Fitness training can happen anywhere.
                Book your classes today and train with the professionals!"
            """.trimIndent())
        webpageShareIntent.type = "text/plain"
        startActivity(Intent.createChooser(webpageShareIntent, "Share with"))
    }

    //Animates the gif
    private fun animateGif(image: Int, view: ImageView) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val gifDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(resources, image))
            view.setImageDrawable(gifDrawable)
            (gifDrawable as AnimatedImageDrawable).start()
        }
    }
}