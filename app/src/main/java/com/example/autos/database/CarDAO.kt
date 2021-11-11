package com.example.autos.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CarDAO  {
    @Query("Select * From Car")
    fun getAllCars() : List<Car>

    @Insert
    fun insertCar(car : Car)

    @Delete
    fun deleteCar(car: Car)

}