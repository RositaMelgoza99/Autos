package com.example.autos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_auto.view.*

class AutoAdapter(private val mContext: Context, private val listaProductos: List<Auto>) : ArrayAdapter<Auto>(mContext, 0, listaProductos){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout  = LayoutInflater.from(mContext).inflate(R.layout.item_auto, parent, false)
        val producto = listaProductos[position]
        layout.nombre.text = producto.nombre
        layout.precio.text = "$${producto.precio}"
        layout.imagenP.setImageResource(producto.imagen)

        return layout
    }

}