package com.example.myapplication.ui

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
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

        setHasOptionsMenu(true)

        binding.addHouse.setOnClickListener{
            findNavController().navigate(R.id.action_addFragment_to_optionFragment)
        }

        return root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.notification_menu, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_news){
            Toast.makeText(requireContext(), "News fragment", Toast.LENGTH_SHORT).show()
        }
        else if(item.itemId == R.id.menu_notification){
            Toast.makeText(requireContext(), "Notification fragment", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}