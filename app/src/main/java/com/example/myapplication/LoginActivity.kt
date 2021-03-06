package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.myapplication.data.UserDao
import com.example.myapplication.data.UserDataBase
import com.example.myapplication.databinding.ActivityLoginBinding
import com.example.myapplication.ui.MainActivity


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    var db: UserDao? = null
    var dataBase: UserDataBase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataBase = Room.databaseBuilder(this, UserDataBase::class.java, "mi-database.db")
            .allowMainThreadQueries()
            .build()
        db = dataBase!!.getUserDao()
        supportActionBar!!.hide()
        binding.btSignIn.setOnClickListener{
                val email = binding.edEmailInput.text.toString()
                val password = binding.edPassword.text.toString()
                val user = db!!.getUser(email, password)
                if (user != null) {
                    val i = Intent(this, MainActivity::class.java)
                    startActivity(i)
                    finish()
                } else {
                    Toast.makeText(this,
                        "Unregistered user, or incorrect",
                        Toast.LENGTH_SHORT).show()
                }

        }

        binding.btCreateAccount.setOnClickListener {
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}
