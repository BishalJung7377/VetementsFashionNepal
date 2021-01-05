package com.bishaljung.vetementsfashionnepal.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class HomeFragments : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(com.bishaljung.vetementsfashionnepal.R.layout.activity_fragment_home, container, false)
    }

}