package com.example.autos.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Car::class), version = DATABASE_VERSION)
abstract class AppDataBase : RoomDatabase() {
    abstract fun carDAO(): CarDAO

    companion object {
        private var instance: AppDataBase? = null
        private fun buildDataBase(context: Context): AppDataBase {
            return Room.databaseBuilder(context, AppDataBase::class.java, DATABASE_NAME).build()
        }

        fun getInstance(context: Context): AppDataBase {
            return instance ?: synchronized(this) {
                instance ?: buildDataBase(context).also { instance = it }
            }
        }
    }

}