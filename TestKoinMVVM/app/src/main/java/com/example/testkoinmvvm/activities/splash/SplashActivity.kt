package com.example.testkoinmvvm.activities.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.testkoinmvvm.R
import org.koin.android.viewmodel.ext.android.viewModel

class SplashActivity : AppCompatActivity() {

    val splashViewModel by viewModel<SplashViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splashViewModel.showNextScreen(this@SplashActivity)

    }
}
