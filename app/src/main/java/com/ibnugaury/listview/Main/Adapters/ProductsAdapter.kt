package com.ibnugaury.listview.Main.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ibnugaury.listview.Main.Model.Product
import com.ibnugaury.listview.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter (val context: Context, val products: List<Product>,
                       val itemClick: (Product) -> Unit) :
                       RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
       val supportView = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
       return ProductHolder(supportView, itemClick)
    }

    override fun getItemCount(): Int {
       return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View?, val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product : Product, context: Context) {
            val resource = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productName?.text = product.title
            productImage?.setImageResource(resource)
            productPrice?.text = product.price
            itemView.setOnClickListener {itemClick(product)}


        }
    }
}