package com.example.autos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_car.view.*


class CarAdapter(private val mContext: Context, private val listProduct: List<Car>) : ArrayAdapter<Car>(mContext, 0, listProduct){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout  = LayoutInflater.from(mContext).inflate(R.layout.item_car, parent, false)
        val product = listProduct[position]

        layout.iv_item_auto_carimage.setImageResource(product.image)
        layout.tv_item_auto_carname.text=product.name
        layout.tv_item_auto_price.text= "$${product.price}"
        return layout
    }

}