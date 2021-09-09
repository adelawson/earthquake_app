package com.example.earthquakechecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.earthquakechecker.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Create a fake list of earthquake locations.

        // Create a fake list of earthquake locations.
        val earthquakes = ArrayList<String>()
        earthquakes.add("San Francisco")
        earthquakes.add("London")
        earthquakes.add("Tokyo")
        earthquakes.add("Mexico City")
        earthquakes.add("Moscow")
        earthquakes.add("Rio de Janeiro")
        earthquakes.add("Paris")

        // Find a reference to the {@link ListView} in the layout

        // Find a reference to the {@link ListView} in the layout
        val earthquakeListView:ListView = binding.list

        // Create a new {@link ArrayAdapter} of earthquakes

        // Create a new {@link ArrayAdapter} of earthquakes
        val adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, earthquakes
        )

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.adapter = adapter

        val vbnv = CityItem(2.1,"Los Angeles",1510500494)


    }
}