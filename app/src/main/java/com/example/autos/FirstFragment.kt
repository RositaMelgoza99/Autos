package com.example.autos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.autos.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
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
        val auto3 = Auto("Spark", 23500.0, "Spark puedes maniobrar y estacionar en espacios reducidos cuando andas por la ciudad en busca de aventuras." ,R.drawable.spark )
        val auto4 = Auto("Cruze", 149000.0, "Además de la potencia de su motor turbo, la seguridad más avanzada, todo su confort y la exclusiva tecnología WI-FI" ,R.drawable.cruze )
        val auto5= Auto("Malibu", 220000.0, "Este auto de tamaño mediano, que une un estilo llamativo con un interior diseñado con la mayor destreza" ,R.drawable.malibu )
        val listaProductos = listOf(auto1, auto2, auto3, auto4, auto5)

        val adapter = AutoAdapter( this.requireContext(), listaProductos)

        listas.adapter = adapter

        //Metodo
        listas.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val autoSelected= parent.getItemAtPosition(position) as Auto

            findNavController().navigate(R.id.SecondFragment)

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


