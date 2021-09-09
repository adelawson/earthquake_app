package com.example.earthquakechecker

import java.text.SimpleDateFormat
import java.util.*

class CityItem(var magnitude: Double, var cityName:String, var date:Int) {

    fun getDate():String{
        val sdr = SimpleDateFormat("dd/mm/yy", Locale.ENGLISH)
        return sdr.format(date)
    }
}