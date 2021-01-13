package com.bishaljung.vetementsfashionnepal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var imgVetements:  ImageView
    private lateinit var txtvetements: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()!!.hide();
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        imgVetements= findViewById(R.id.imgVetements)
        txtvetements =   findViewById(R.id.txtvetements)

        imgVetements.alpha =  0f
        imgVetements.animate().setDuration(2500).alpha(
            1f
        ).withEndAction{
            val intent =  Intent(this, StartPageActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()

        }
    }
}