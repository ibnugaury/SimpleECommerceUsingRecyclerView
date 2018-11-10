package com.ibnugaury.listview.Main.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.ibnugaury.listview.Main.Adapters.CategoryRecyclerAdapter
import com.ibnugaury.listview.Main.Services.DataServices
import com.ibnugaury.listview.Main.Utilities.EXTRA_CATEGORY
import com.ibnugaury.listview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out)

        adapter = CategoryRecyclerAdapter(this, DataServices.categories) { category ->
           val productIntent = Intent(this, ProjectActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
           startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }


}
