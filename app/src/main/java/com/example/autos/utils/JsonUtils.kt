package com.example.autos.utils

import android.content.Context
import java.io.IOException
import java.nio.charset.Charset

class JsonUtils {
    companion object{
        fun getJasonFromFile(fileName: String, context: Context): String ?{
            val jsonString : String
            try {
                val inputString = context.assets.open(fileName)
                val size = inputString.available()
                val buffer = ByteArray(size)
                inputString.read(buffer)
                inputString.close()
                jsonString= String(buffer, Charset.defaultCharset())
            }catch (exeption : IOException){
                exeption.printStackTrace()
                return  null
            }
            return jsonString
        }
    }
}