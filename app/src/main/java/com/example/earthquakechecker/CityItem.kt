package com.example.earthquakechecker

import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

data class  CityItem(var magnitude: Double, var cityName:String, var date:Int) {

    fun getDate():String{
        val long = (date*1000).toLong()
        val sdr = SimpleDateFormat("dd/mm/yy", Locale.ENGLISH)
        return sdr.format(long)
    }
}
object SampleCities{
    private val magnitudes = arrayListOf(7.1,2.3,4.5,5.6)
    private val cities = arrayListOf("texas","oklahoma","yemen","naija")
    private val dates = arrayListOf(1631835870,1631839870,1631839870,1631839870)


    var list:ArrayList<CityItem>?= null
        get() {
            if (field!=null)
                return field
            field = ArrayList()
            for(i in magnitudes.indices){
                val magnitude = magnitudes[i]
                val city = cities[i]
                val date = dates[i]
                val cityItem = CityItem(magnitude,city,date)
                field!!.add(cityItem)
            }
            return field
        }
}