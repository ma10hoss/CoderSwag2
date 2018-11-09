package com.example.coding.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.coding.Adapters.CategoryAdapter
import com.example.coding.Models.Category
import com.example.coding.R
import com.example.coding.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
                // ArrayAdapter inherits from BaseAdapter--see CategoryAdapter
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataServices.categories)
        categoryListView.adapter = adapter

        // setting on click listener

     }
}
