package com.example.autos

import android.app.AlertDialog
import android.os.Bundle
import android.os.Message
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.DialogTitle
import androidx.appcompat.widget.Toolbar
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.autos.MainActivity.Companion.CAR_CATALOG_DESCRIPTION
import com.example.autos.MainActivity.Companion.CAR_CATALOG_IMAGE
import com.example.autos.MainActivity.Companion.CAR_CATALOG_TITLE
import com.example.autos.databinding.ActivityMainBinding
import com.example.autos.databinding.FragmentSecondBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.view.*


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!


    private var mTitle: String = ""
    private var mImage: Int = 0
    private var mPrice: Double = 0.0
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
        binding.fab.setOnClickListener { view ->
               showAlertDialog(args.carCatalogTitle, args.carCatalogPrice)
        }


        // Inicializando lo componentes
        binding.ivFragmentSecondCarimage.setImageResource(args.carCatalogImage)
        binding.tvFragmentSecondCartitle.text = args.carCatalogTitle
        binding.tvFragmentSecondCardescription.text = args.carCatalogDescription
        //(requireActivity() as AppCompatActivity).supportActionBar?.title = args.carCatalogTitle

    }

    fun showAlertDialog(title: String, message: String) {
        val builder: AlertDialog.Builder? = activity?.let {
            AlertDialog.Builder(it)
        }
        builder?.setMessage(message)
            ?.setTitle(title)
        builder?.create()
        builder?.show()
    }

}


