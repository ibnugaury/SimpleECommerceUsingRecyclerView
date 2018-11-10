package com.ibnugaury.listview.Main.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.GridLayout
import com.ibnugaury.listview.Main.Adapters.ProductsAdapter
import com.ibnugaury.listview.Main.Services.DataServices
import com.ibnugaury.listview.Main.Utilities.EXTRA_CATEGORY
import com.ibnugaury.listview.Main.Utilities.EXTRA_PRODUCT
import com.ibnugaury.listview.R
import kotlinx.android.synthetic.main.activity_project.*

class ProjectActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataServices.getProducts(categoryType)) {product ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(EXTRA_PRODUCT, product)
            startActivity(intent)

        }
        productListView.adapter = adapter
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
    }
}
