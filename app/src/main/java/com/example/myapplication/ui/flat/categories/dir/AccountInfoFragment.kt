package com.example.myapplication.ui.flat.categories.dir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.ui.house.categories.dir.info.InfoAdapter
import com.example.myapplication.databinding.FragmentInfoBinding


class AccountInfoFragment : Fragment() {
    private lateinit var _binding: FragmentInfoBinding
    private val binding get() = _binding!!
    private var adapter = InfoAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        init()
        return root
    }

    private fun init(){
        binding.apply {
            infoRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            infoRecycler.adapter = adapter
        }
    }
}