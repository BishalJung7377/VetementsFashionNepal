package com.bishaljung.vetementsfashionnepal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {

    private lateinit var backIc: ImageView
    private lateinit var logIntxt: TextView
    private lateinit var vetementTitle: TextView
    private lateinit var vIcn: ImageView
    private lateinit var emailSec: EditText
    private lateinit var passwordSec: EditText
    private lateinit var forgetPass: TextView
    private lateinit var btnLogIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()!!.hide();
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        backIc = findViewById(R.id.backIcn)
        logIntxt = findViewById(R.id.tvlogIntxt)
        vetementTitle = findViewById(R.id.tvtitlelogin)
        vIcn = findViewById(R.id.imageV)
        emailSec = findViewById(R.id.etEmail)
        passwordSec = findViewById(R.id.etPass)
        forgetPass = findViewById(R.id.tvforrgetpass)
        btnLogIn = findViewById(R.id.btnIdlogin)

        backIc.setOnClickListener {
            val intent = Intent(this, StartPageActivity::class.java)
            startActivity(intent)
        }


        btnLogIn.setOnClickListener {
            val intent = Intent(this, DiscoverItemsActivity::class.java)
            startActivity(intent)
//            Toast.makeText(this, "Successfully Logged In", Toast.LENGTH_LONG).show()
//                if (emailSec.text.equals("admin") && passwordSec.text.equals("admin")) {
//                    val intent = Intent(this, DiscoverItemsActivity::class.java)
//                    startActivity(intent)
//                } else {
//                    val builder = AlertDialog.Builder(this)
//                    builder.setTitle("Incorrect Credientials")
//                    builder.setMessage("The provided email and password is incorrect")
//                    builder.setIcon(android.R.drawable.ic_dialog_alert)
//                    builder.setPositiveButton("Exit") { dialogInterface, which -> Toast.makeText(this, "Clicked Exit", Toast.LENGTH_SHORT).show() }
//                }
        }
    }
}
