package com.ibnugaury.listview.Main.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ibnugaury.listview.Main.Model.Product
import com.ibnugaury.listview.Main.Utilities.EXTRA_PRODUCT
import com.ibnugaury.listview.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
        detailImageView.setImageResource(resourceId)
        detailProductName.text = product.title
        detailProductPrice.text = product.price
        detailDesc.text = product.desc

    }
}
