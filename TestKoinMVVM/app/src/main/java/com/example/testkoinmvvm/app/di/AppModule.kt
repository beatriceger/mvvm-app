package com.example.testkoinmvvm.app.di

import com.example.testkoinmvvm.activities.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module


val appModule: Module = module {

    viewModel { SplashViewModel() }
}
