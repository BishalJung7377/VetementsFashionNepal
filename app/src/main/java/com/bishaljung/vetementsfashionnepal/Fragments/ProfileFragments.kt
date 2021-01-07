package com.bishaljung.vetementsfashionnepal.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.bishaljung.vetementsfashionnepal.R
import com.bishaljung.vetementsfashionnepal.StartPageActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class ProfileFragments : Fragment() {
    private lateinit var imgbackIcn:ImageView
    private lateinit var tvRegister: TextView
    private lateinit var userprofileimage: ImageView
    private lateinit var tvuserprofilename: TextView
    private lateinit var tvuserprofileemail: TextView
    private lateinit var totalitemcrdview: CardView
    private lateinit var itemCardView:  ImageView
    private lateinit var tvuseritems: TextView
    private lateinit var tvitemnumbers: TextView
    private lateinit var tveditFname : TextInputLayout
    private lateinit var eteditFname : TextInputEditText
    private lateinit var tveditEmail : TextInputLayout
    private lateinit var eteditEmail : TextInputEditText
    private lateinit var tveditpass : TextInputLayout
    private lateinit var eteditpass : TextInputEditText
    private lateinit var tveditnumb : TextInputLayout
    private lateinit var eteditnumb : TextInputEditText
    private lateinit var btnupdate: Button

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(com.bishaljung.vetementsfashionnepal.R.layout.activity_fragment_profile, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        imgbackIcn = requireView().findViewById(R.id.imgbackIcn)


        imgbackIcn.setOnClickListener{
            val intent = Intent(this, HomeFragments::class.java)
            startActivity(intent)
        }

    }
}
