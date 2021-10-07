package com.example.autos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.navigation.fragment.findNavController
import com.example.autos.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.item_car.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
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
        val car1 =
            Car("Chevy", 35000.0, "Es un Automovil muy economico y practico", R.drawable.chevy)
        val car2 = Car(
            "Onix",
            275000.0,
            "Desafia el status con sus caracteristicas nunca antes vistas",
            R.drawable.onix
        )
        val car3 = Car(
            "Spark",
            23500.0,
            "Spark puedes maniobrar y estacionar en espacios reducidos cuando andas por la ciudad en busca de aventuras.",
            R.drawable.spark
        )
        val car4= Car(
            "Cruze",
            149000.0,
            "Además de la potencia de su motor turbo, la seguridad más avanzada, todo su confort y la exclusiva tecnología WI-FI",
            R.drawable.cruze
        )
        val car5 = Car(
            "Malibu",
            220000.0,
            "Este auto de tamaño mediano, que une un estilo llamativo con un interior diseñado con la mayor destreza",
            R.drawable.malibu

        )
        val listProduct = listOf(car1, car2, car3, car4, car5)
        val adapter = CarAdapter(this.requireContext(), listProduct)
        list.adapter = adapter

        //Metodo
        list.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val autoSelected = parent.getItemAtPosition(position) as Car
            val action= FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                autoSelected.name,
                autoSelected.description,
                autoSelected.image
            )

            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


