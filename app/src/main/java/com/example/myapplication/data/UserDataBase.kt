package com.example.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.model.User


//@Database(entities = [User::class], version = 1, exportSchema = false)

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDataBase : RoomDatabase() {
    abstract fun getUserDao(): UserDao?
}

//abstract class UserDataBase: RoomDatabase() {
//    abstract fun userDao(): UserDao
//
//    companion object {
//        @Volatile
//        private var INSTANCE: UserDataBase? = null
//
//        fun getDatabase(context: Context): UserDataBase {
//            val tempInstance = INSTANCE
//            if (tempInstance != null) {
//                return tempInstance
//            }
//            synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    UserDataBase::class.java,
//                    "user_database"
//                ).build()
//                INSTANCE = instance
//                return instance
//            }
//        }
//    }
//}