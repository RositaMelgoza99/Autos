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
import com.example.autos.MainActivity.Companion.CAR_CATALOG_DESCRIPTION
import com.example.autos.MainActivity.Companion.CAR_CATALOG_IMAGE
import com.example.autos.MainActivity.Companion.CAR_CATALOG_TITLE
import com.example.autos.databinding.FragmentSecondBinding


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    private var mTitle: String = ""
    private var mImage: Int = 0
    private var mDescription: String = ""

    // obtendra los argumentos que tiene la lista
    private val args: SecondFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Inicializando lo componentes
        binding.ivFragmentSecondCarimage.setImageResource(args.carCatalogImage)
        binding.tvFragmentSecondTitleCar.text = args.carCatalogTitle
        binding.tvFragmentSecondDescriptionCar.text = args.carCatalogDescription
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}