package com.example.coding.Services

import com.example.coding.Models.Category
import com.example.coding.Models.Product

object DataServices {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimages"),
        Category("HATS","hatimages"),
        Category("DIGITAL","digitalgoodimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimages"),
        Category("HATS","hatimages"),
        Category("DIGITAL","digitalgoodimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimages"),
        Category("HATS","hatimages"),
        Category("DIGITAL","digitalgoodimage")
    )
    val hats = listOf(
        Product("Devslopes Grafic Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$22","hat0"),
        Product("Devslopes Hat Snapback","$24","hat4"),
        Product("Devslopes Grafic Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$22","hat0"),
        Product("Devslopes Hat Snapback","$24","hat4")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$32","hoodie2"),
        Product("Devslopes Hoodie Gray","$28","hoodie3"),
        Product("Devslopes Hoodie Black","$32","hoodie4"),
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$32","hoodie2"),
        Product("Devslopes Hoodie Gray","$28","hoodie3"),
        Product("Devslopes Hoodie Black","$32","hoodie4")
    )
    val shirts = listOf( Product("Devslopes shirt Gray","$17","shirt1"),
        Product("Devslopes badge light gray","$18","shirt2"),
        Product("Devslopes logo shirt red","$19","shirt3"),
        Product("Devslopes Hoodie hustle","$20","shirt4"),
        Product("KickFlip Studio","$18","shirts5"),
        Product("Devslopes badge light gray","$18","shirt2"),
        Product("Devslopes logo shirt red","$19","shirt3"),
        Product("Devslopes Hoodie hustle","$20","shirt4"),
        Product("KickFlip Studio","$18","shirts5")
    )
}