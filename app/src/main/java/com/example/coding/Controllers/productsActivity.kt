package com.example.coding.Controllers

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.GridLayout
import com.example.coding.Adapters.ProductsAdapter
import com.example.coding.R
import com.example.coding.Services.DataServices
import com.example.coding.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class productsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_acticivity)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataServices.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720)
            spanCount = 3

        val layouManager = GridLayoutManager(this, 2)
            productListView.layoutManager = layouManager
        productListView.adapter = adapter
    }
}
