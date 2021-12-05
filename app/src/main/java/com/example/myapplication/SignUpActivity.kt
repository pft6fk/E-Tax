package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.myapplication.data.UserDao
import com.example.myapplication.data.UserDataBase
import com.example.myapplication.databinding.ActivitySignUpBinding
import com.example.myapplication.model.User
import com.example.myapplication.ui.MainActivity


class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private var userDao: UserDao? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSignUp.setOnClickListener{
                startActivity(Intent(this, LoginActivity::class.java))
        }

        userDao = Room.databaseBuilder(this, UserDataBase::class.java, "mi-database.db")
            .allowMainThreadQueries()
            .build().getUserDao()
        binding.btSignUp.setOnClickListener{
            val userName = binding.edNameInput.text.toString()
            val email = binding.edEmailInput.text.toString()
            val password = binding.edPasswordInput.text.toString()
            val passwordConf = binding.edPasswordCheckInput.text.toString()
            if (password == passwordConf) {
                val user = User(userName, password, email, "")
                userDao!!.insert(user)
                val moveToLogin = Intent(this, MainActivity::class.java)
                startActivity(moveToLogin)
            } else {
                Toast.makeText(this,
                    "Password is not matching",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}