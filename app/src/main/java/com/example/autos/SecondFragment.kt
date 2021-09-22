package com.example.autos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.autos.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.item_auto.*
import kotlinx.android.synthetic.main.item_auto.view.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Recuperar la informacion



        // Inicializando lo componentes
        val titulo= view.findViewById<TextView>(R.id.titulo)
        val  descripcion  = view.findViewById<TextView>(R.id.descripcion)
        val imagen = view.findViewById<ImageView>(R.id.imagen)


        imagen.setImageResource(R.drawable.chevy)
        titulo.setText("Auto")
        descripcion.setText("Al parecer, los consumidores se están dando cuenta de que los sistemas avanzados de prevención de accidentes están disponibles con rapidez en prácticamente todos los segmentos del negocio de automóviles, y son los accesorios que más agregan a la compra de un vehículo.")






    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}