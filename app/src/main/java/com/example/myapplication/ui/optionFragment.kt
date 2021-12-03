package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentOptionBinding


class optionFragment : Fragment() {
    private lateinit var _binding : FragmentOptionBinding
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentOptionBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.flat.setOnClickListener {
            findNavController().navigate(R.id.action_optionFragment_to_flatOption)
        }

        binding.house.setOnClickListener {
            findNavController().navigate(R.id.action_optionFragment_to_houseOption)
        }

        return root
    }

}