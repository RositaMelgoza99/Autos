package com.example.autos.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Car(
    @PrimaryKey
    val id: Int,
    @ColumnInfo
    val name: String,
    @ColumnInfo
    val price: Double,
    @ColumnInfo
    val description: String,
    @ColumnInfo
    val image: Int
)


