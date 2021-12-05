package com.example.myapplication.ui.taxes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.ui.MainActivity

class FragmentTax : Fragment() {
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        mainActivity = requireActivity() as MainActivity
        mainActivity.hideDrawer()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tax2, container, false)
    }

}