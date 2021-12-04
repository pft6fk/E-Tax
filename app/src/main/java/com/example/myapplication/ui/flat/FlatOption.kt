package com.example.myapplication.ui.flat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentFlatOptionBinding


class FlatOption : Fragment() {
    private lateinit var _binding: FragmentFlatOptionBinding
    private val binding get() = _binding!!
    private var adapter = FlatAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentFlatOptionBinding.inflate(inflater, container, false)
        val root = binding.root

        init()

        adapter.onItemClick = { //(it) is position of clicked recycler
            if(it == 0)     findNavController().navigate(R.id.action_flatOption_to_electricityFragment)
            if(it == 1)     findNavController().navigate(R.id.action_flatOption_to_electricityFragment)
            if(it == 2)     findNavController().navigate(R.id.action_flatOption_to_electricityFragment)
            if(it == 3)     findNavController().navigate(R.id.action_flatOption_to_electricityFragment)
            if(it == 4)     findNavController().navigate(R.id.action_flatOption_to_electricityFragment)
            if(it == 5)     findNavController().navigate(R.id.action_flatOption_to_electricityFragment)
            if(it == 6)     findNavController().navigate(R.id.action_flatOption_to_electricityFragment)
        }

        return root
    }
    private fun init(){
        binding.apply {
            flatRC.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            flatRC.adapter = adapter
        }
    }

}