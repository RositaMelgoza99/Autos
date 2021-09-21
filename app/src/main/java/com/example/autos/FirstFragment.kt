package com.example.autos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.autos.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.item_auto.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val auto1 = Auto("Chevy", 35000.0, "Es un Automovil muy economico y practico" ,R.drawable.chevy  )
        val auto2 = Auto("Onix", 275000.0, "Desafia el status con sus caracteristicas nunca antes vistas" ,R.drawable.onix )
        val listaProductos = listOf(auto1, auto2)

        val adapter = AutoAdapter( this.requireContext(), listaProductos)

        listas.adapter = adapter

        listas.setOnClickListener{

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


