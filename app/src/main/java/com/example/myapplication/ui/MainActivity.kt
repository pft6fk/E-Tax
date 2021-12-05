package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = findNavController(R.id.fragmentContainer)
        setupActionBarWithNavController(navController)

        actionBar?.setDisplayHomeAsUpEnabled(false)

        drawerLayout=binding.drawerLayout

        binding.dummy.setOnClickListener {
            binding.navView.visibility = View.VISIBLE
//        drawerLayout.closeDrawer(GravityCompat.START)
        }



        binding.dummy1.setOnClickListener {
            binding.navView.visibility = View.GONE
        }

        binding.navView.setupWithNavController(navController)
        NavigationUI.setupWithNavController(binding.navView,navController)

        setupActionBarWithNavController(navController, drawerLayout)

    }

    fun hideDrawer(){
        binding.navView.visibility = View.GONE
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragmentContainer)
        return navController.navigateUp()
    }
}