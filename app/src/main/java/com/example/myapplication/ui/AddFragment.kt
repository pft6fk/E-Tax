package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentAddBinding


class AddFragment : Fragment() {
    private lateinit var _binding: FragmentAddBinding
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentAddBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.addHouse.setOnClickListener{
            findNavController().navigate(R.id.action_addFragment_to_optionFragment)
        }

        return root
    }
}