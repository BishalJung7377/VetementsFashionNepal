package com.bishaljung.vetementsfashionnepal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class StartPageActivity : AppCompatActivity() {
    private lateinit var title: TextView
    private lateinit var loginbtn: Button
    private lateinit var registerbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()!!.hide();
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startpage)

        title = findViewById(R.id.tvtitle)
        loginbtn = findViewById(R.id.btnlogin)
        registerbtn = findViewById(R.id.btnregister)

        loginbtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        registerbtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}