package com.example.coding.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.coding.R
import com.example.coding.Utilities.EXTRA_CATEGORY

class productsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_acticivity)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
