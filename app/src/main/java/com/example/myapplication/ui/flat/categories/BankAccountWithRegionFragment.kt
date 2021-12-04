package com.example.myapplication.ui.flat.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentBankAccountBinding
import com.example.myapplication.databinding.FragmentBankAccountWithRegionBinding


class BankAccountWithRegionFragment : Fragment() {
    private lateinit var _binding: FragmentBankAccountWithRegionBinding
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentBankAccountWithRegionBinding.inflate(inflater, container, false)
        val root = binding.root
        // adapter for list
        val regions = resources.getStringArray(R.array.regions)
        val regionAdapter = ArrayAdapter(requireContext(), R.layout.item_dropdown_region, regions)
        binding.autoCompleteColor.setAdapter(regionAdapter)
        binding.btContinue.setOnClickListener {
            findNavController().navigate(R.id.action_bankAccountWithRegionFragment_to_accountInfoFragment)
        }

        binding.btCancel.setOnClickListener {
            findNavController().navigate(R.id.action_bankAccountWithRegionFragment_to_flatOption)
        }

        return root
    }
}