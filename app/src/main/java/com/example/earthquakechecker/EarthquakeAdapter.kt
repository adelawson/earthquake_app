package com.example.earthquakechecker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class EarthquakeAdapter(val context: Context, var cityList :ArrayList<CityItem> ): RecyclerView.Adapter<EarthquakeAdapter.viewHolder>() {

    inner class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentPosition:Int = -1
        private var currentCity: CityItem? = null

        private val magnitudeTextView = itemView.findViewById<TextView>(R.id.magnitude_txv)
        private val cityTextView = itemView.findViewById<TextView>(R.id.city_txv)
        private val dateTextView = itemView.findViewById<TextView>(R.id.date_txv)

        fun setData(city:CityItem,position: Int){
            magnitudeTextView.text = city.magnitude.toString()
            cityTextView.text = city.cityName
            dateTextView.text= city.getDate()

            this.currentPosition = position
            this.currentCity = city
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.earthquake_itemview,parent,false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: viewHolder, position: Int) {
        val city = cityList[position]
        viewHolder.setData(city,position)
    }

    override fun getItemCount(): Int = cityList.size


}