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
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.item_auto.*
import kotlinx.android.synthetic.main.item_auto.view.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    private var mTitle: String = ""
    private var mDescription: String = ""
    private var mImage: Int = 0

    fun newInstance(
        title: String,
        description: String,
        image: Int
    ): SecondFragment {
        val fragment = SecondFragment()
        val args = Bundle()
        args.putString(CAR_CATALOG_TITLE, title)
        args.putString(CAR_CATALOG_DESCRIPTION, description)
        args.putInt(CAR_CATALOG_IMAGE, image)
        fragment.arguments = args
        return fragment
    }

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
        val tvTitle = view.findViewById<TextView>(R.id.titulo)
        val tvDescription = view.findViewById<TextView>(R.id.descripcion)
        val imgImage = view.findViewById<ImageView>(R.id.imagen)

        tvTitle.text=mTitle
        tvDescription.text=mDescription
        imgImage.setImageResource(mImage)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}