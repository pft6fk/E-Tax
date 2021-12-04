package com.example.myapplication.data

import androidx.room.*
import com.example.myapplication.model.User


@Dao
interface UserDao {
    @Query("SELECT * FROM user where email= :mail and password= :password")
    fun getUser(mail: String?, password: String?): User?

    @Insert
    fun insert(user: User?)

    @Update
    fun update(user: User?)

    @Delete
    fun delete(user: User?)
}

//@Dao
//interface UserDao {
//
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun signUp(user: User)
//
//    @Query("SELECT * FROM user_table ORDER BY id ASC")
//    fun readAllData(): LiveData<List<User>>
//
//    @Query("SELECT * FROM user_table WHERE id=(:userId) AND password=(:password)")
//    fun login(userId: Int, password: String): User
//
//    @Update
//    suspend fun updateAccount(user: User)
//
//    @Query("DELETE FROM user_table")
//    suspend fun deleteAll()
//
//
//    @Delete
//    suspend fun deleteUser(user: User)
//}


