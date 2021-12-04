package com.example.myapplication.ui.flat.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentBankAccountBinding


class BankAccountFragment : Fragment() {
    private lateinit var _binding: FragmentBankAccountBinding
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentBankAccountBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.btContinue.setOnClickListener {
            findNavController().navigate(R.id.action_bankAccountFragment_to_accountInfoFragment)
        }

        binding.btCancel.setOnClickListener {
            findNavController().navigate(R.id.action_bankAccountFragment_to_flatOption)
        }

        return root
    }
}