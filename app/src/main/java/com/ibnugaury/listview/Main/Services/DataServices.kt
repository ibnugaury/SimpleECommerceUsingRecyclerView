package com.ibnugaury.listview.Main.Services

import com.ibnugaury.listview.Main.Model.Category
import com.ibnugaury.listview.Main.Model.Product

//create object DataServices for adding some data structure that willl use on this app
object DataServices {
    val categories = listOf(
            Category("Hats", "hatimage"),
            Category("Shirts", "shirtimage"),
            Category("Hoodie", "hoodieimage"),
            Category("Digital", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Shark Hat", "5$", "hat1", "This is a Shark hat that has good and fancy product"),
            Product("Ripcurl Hat", "15$", "hat2", "This is a Ripcurl hat that has good and fancy product"),
            Product("Doodie Hat", "5.5$", "hat3", "This is a Doodie hat that has good and fancy product"),
            Product("Boy Hat", "4$", "hat4", "This is a Boy hat that has good and fancy product")
    )

    val shirt = listOf(
            Product("Shark Shirt", "25$", "shirt1", "This is a Shark Shirt that has good and fancy product"),
            Product("Boy Shirt", "35$", "shirt2", "This is a Boy Shirt that has good and fancy product"),
            Product("Doddie Shirt", "15$", "shirt3", "This is a Doddie Shirt that has good and fancy product"),
            Product("Girl Shirt", "27.5$", "shirt4", "This is a Bla Bla Shirt that has good and fancy product"),
            Product("Lava Shirt", "25$", "shirt5", "This is a Lava Shirt that has good and fancy product")
    )

    val hoodie = listOf(
            Product("Shark Hoodie", "45$", "hoodie1", "This is a Shark Hoodie that has good and fancy product"),
            Product("Boy Hoodie", "50$", "hoodie2", "This is a Boy Hoodie that has good and fancy product"),
            Product("Girl Hoodie", "43$", "hoodie3", "This is a Girl Hoodie that has good and fancy product"),
            Product("Lava Hoodie", "13$", "hoodie4", "This is a Lava Hoodie that has good and fancy product")
    )

    val digitalgoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "Hats" -> hats
            "Shirts" -> shirt
            "Hoodie" -> hoodie
            else -> digitalgoods

        }
    }

}