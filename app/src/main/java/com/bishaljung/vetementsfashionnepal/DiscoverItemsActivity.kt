package com.bishaljung.vetementsfashionnepal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.bishaljung.vetementsfashionnepal.Fragments.CartFragments
import com.bishaljung.vetementsfashionnepal.Fragments.FavouritesFragment
import com.bishaljung.vetementsfashionnepal.Fragments.HomeFragments
import com.bishaljung.vetementsfashionnepal.Fragments.ProfileFragments
import com.bishaljung.vetementsfashionnepal.model.ItemCartModel
import com.google.android.material.bottomnavigation.BottomNavigationView

class DiscoverItemsActivity : AppCompatActivity() {
    private lateinit var fragmentCont: FrameLayout
    private lateinit var botommenu: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()!!.hide()
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discover_items)
        fragmentCont = findViewById(R.id.fragmentcontainer)
        botommenu = findViewById(R.id.bottomnavigation)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomnavigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener)

        supportFragmentManager.beginTransaction().replace(R.id.fragmentcontainer, HomeFragments())
            .commit()

    }

    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_home -> selectedFragment = HomeFragments()
                R.id.nav_favourites -> selectedFragment = FavouritesFragment()
                R.id.nav_cart -> selectedFragment = CartFragments()
                R.id.nav_user -> selectedFragment = ProfileFragments()
            }
            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction().replace(
                    R.id.fragmentcontainer,
                    selectedFragment
                ).commit()
            }
            true
        }


}



































































//    class HomeFragments : Fragment() {
//            override fun onCreateView(
//                inflater: LayoutInflater,
//                container: ViewGroup?,
//                savedInstanceState: Bundle?
//            ): View? {
//                return inflater.inflate(com.bishaljung.vetementsfashionnepal.R.layout.activity_fragment_home, container, false)
//            }
//
//    }
//    class FavoritesFragment : Fragment() {
//        override fun onCreateView(
//                inflater: LayoutInflater,
//                container: ViewGroup?,
//                savedInstanceState: Bundle?
//        ): View? {
//            return inflater.inflate(com.bishaljung.vetementsfashionnepal.R.layout.activity_fragment_favourite, container, false)
//        }
//    }
//    class CartFragments : Fragment() {
//            override fun onCreateView(
//                inflater: LayoutInflater,
//                container: ViewGroup?,
//                savedInstanceState: Bundle?
//            ): View? {
//                return inflater.inflate(com.bishaljung.vetementsfashionnepal.R.layout.activity_fragment_cart, container, false)
//            }
//    }
//    class ProfileFragments : Fragment() {
//            override fun onCreateView(
//                inflater: LayoutInflater,
//                container: ViewGroup?,
//                savedInstanceState: Bundle?
//            ): View? {
//                return inflater.inflate(com.bishaljung.vetementsfashionnepal.R.layout.activity_fragment_profile, container, false)
//            }
//    }