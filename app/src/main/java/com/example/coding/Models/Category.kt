package com.example.coding.Models

class Category(val title: String, val image: String) {
    // over rides the default for the contents inside array adapters. puts in the title:string
    override fun toString(): String {
        return title
    }
}