package com.example.testkoinmvvm.activities.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.testkoinmvvm.R
import com.example.testkoinmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  navigation.setupWithNavController(findNavController(R.id.container))
    }
}
