package com.example.distancetrackerapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController


import androidx.navigation.fragment.NavHostFragment
import com.example.distancetrackerapp.R
import com.example.distancetrackerapp.util.Permissions.hasLocationPermission
import dagger.hilt.android.AndroidEntryPoint


//@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // navController = findNavController(R.id.navhostFragment)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navhostFragment) as NavHostFragment?

        if (navHostFragment != null) {
            val navController = navHostFragment.navController
            if(hasLocationPermission(this)){
                navController.navigate(R.id.action_permissionFragment_to_mapsFragment)
            }
            // Setup NavigationUI here
        }




    }
}