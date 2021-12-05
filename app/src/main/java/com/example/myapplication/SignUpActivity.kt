package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
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

        supportActionBar!!.hide()
        userDao = Room.databaseBuilder(this, UserDataBase::class.java, "mi-database.db")
            .allowMainThreadQueries()
            .build().getUserDao()
        binding.btSignUp.setOnClickListener{
            val userName = binding.edNameInput.text.toString()
            val email = binding.edEmailInput.text.toString()
            val password = binding.edPasswordInput.text.toString()
            val phoneNumber = binding.edPhoneInput.text.toString()
            val passwordConf = binding.edPasswordCheckInput.text.toString()
            if(inputCheck(userName, phoneNumber,email,password,passwordConf)){
            if (password == passwordConf) {
                val user = User(userName, password, email, "")
                userDao!!.insert(user)
                val moveToLogin = Intent(this, LoginActivity::class.java)
                startActivity(moveToLogin)
                finish()
            } else {
                Toast.makeText(this,
                    "Несоответствие паролей",
                    Toast.LENGTH_SHORT).show()
            }
        }else {
                Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btCancel.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
    fun inputCheck(name: String, phoneNumber: String, email: String, password: String, passwordCheck: String): Boolean{
        return !(TextUtils.isEmpty(name) or TextUtils.isEmpty(phoneNumber) or TextUtils.isEmpty(email) or TextUtils.isEmpty(password) or TextUtils.isEmpty(passwordCheck))
    }
}