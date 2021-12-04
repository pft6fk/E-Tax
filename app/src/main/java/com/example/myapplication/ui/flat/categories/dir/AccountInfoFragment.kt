package com.example.myapplication.ui.flat.categories.dir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentAccountInfoBinding


class AccountInfoFragment : Fragment() {
    private lateinit var _binding: FragmentAccountInfoBinding
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentAccountInfoBinding.inflate(inflater, container, false)
        val root = binding.root

        return root
    }
}