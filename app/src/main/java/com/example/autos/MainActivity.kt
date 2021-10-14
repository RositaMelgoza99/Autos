package com.example.autos

import SnackbarLib
import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.autos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val onStart = "En esta fase se estaria viendo el diseño pero no se interactua con el usuario"
    val onResume="En esta fase ya se interactua con el usuario"
    val onPause = "Es cuando la aplicacion ya no esta en primer plano o ajustar las operaciones que no deben continuar"
    val onStop = "Es cuando el usuario ya no puede ver la actividad y la app debe liberar o ajustar los recursos que no son necesarios mientras no sea visible para el usuario"
    val onDestroy = "Se manda llamar antes de que finalice la actividad y pueden recuperar cualquier elemento que se necesite antes de que finalice el objeto Activity."
    val onRestart = "Es cuando la actividad actual se vuelve a mostrar al usuario "
    companion object {
        const val CAR_CATALOG_TITLE = "carCatalogTitle"
        const val CAR_CATALOG_DESCRIPTION = "carCatalogDescription"
        const val CAR_CATALOG_IMAGE = "CarCatalogImage"
    }

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view,SnackbarLib().hello(), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()



            SnackbarLib().add(10,20)
            SnackbarLib().substract(3, 18)


        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }



    override fun onStart() {
        Log.d(MainActivity.javaClass.name, onStart)
        super.onStart()
    }

    override fun onResume() {
        Log.d(MainActivity.javaClass.name, onResume)
        super.onResume()
    }

    override fun onPause() {
        Log.d(MainActivity.javaClass.name, onPause)
        super.onPause()
    }

    override fun onStop() {
        Log.d(MainActivity.javaClass.name, onStop )
        super.onStop()
    }


    override fun onDestroy() {
        Log.d(MainActivity.javaClass.name, onDestroy)
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(MainActivity.javaClass.name, onRestart)
        super.onRestart()
    }


}