package com.bishaljung.vetementsfashionnepal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class RegisterActivity : AppCompatActivity() {
    private lateinit var regText: TextView
    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var gender: EditText
    private lateinit var number: EditText
    private lateinit var address: EditText
    private lateinit var password: EditText
    private lateinit var photo: EditText
    private lateinit var regBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()!!.hide();
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        regText = findViewById(R.id.tvRegister)
        name = findViewById(R.id.etName)
        email = findViewById(R.id.etEmail)
        gender = findViewById(R.id.etGender)
        number = findViewById(R.id.etNumber)
        address = findViewById(R.id.etAddress)
        password = findViewById(R.id.etPass)
        photo = findViewById(R.id.etPhoto)
        regBtn = findViewById(R.id.btnregister)


        regBtn.setOnClickListener {
            Toast.makeText(this, "rregisteredd", Toast.LENGTH_SHORT).show()
        }


    }
}