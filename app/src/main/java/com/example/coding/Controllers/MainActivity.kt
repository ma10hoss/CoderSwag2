package com.example.coding.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.coding.Adapters.CategoryAdapter
import com.example.coding.Adapters.CategoryRecyclerAdapter
import com.example.coding.Models.Category
import com.example.coding.R
import com.example.coding.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
                // ArrayAdapter inherits from BaseAdapter--see CategoryAdapter
    lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataServices.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
            categoryListView.layoutManager = layoutManager
            categoryListView.setHasFixedSize(true)

     }
}
