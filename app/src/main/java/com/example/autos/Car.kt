package com.example.autos

import java.io.Serializable

class Car(val name: String, val price: Double, val description: String, val image: Int) :
    Serializable {
}