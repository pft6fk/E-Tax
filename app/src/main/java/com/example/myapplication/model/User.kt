package com.example.myapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class User(
    var userName: String,
    var password: String,
    var email: String,
    var bankAccount: String)  {
    @PrimaryKey(autoGenerate = true)
    var id = 0

    override fun toString(): String {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}'
    }
}
