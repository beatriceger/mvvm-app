package com.example.testkoinmvvm.activities.splash

import android.app.Activity
import android.arch.lifecycle.ViewModel
import android.content.Intent
import com.example.testkoinmvvm.activities.login.LoginActivity

import com.example.testkoinmvvm.activities.main.MainActivity
import java.util.*
import kotlin.concurrent.timerTask

class SplashViewModel : ViewModel() {

    val timer = Timer()

    fun showNextScreen(activity: Activity) {

        if (checkUserIsLoggedIn(activity)) {
            timer.schedule(timerTask {
                showMainScreen(activity)
            }, 3000)
        } else {
            timer.schedule(timerTask { showLoginScreen(activity) }, 3000)
        }
    }

    private fun checkUserIsLoggedIn(activity: Activity): Boolean {
        return true
    }

    private fun showLoginScreen(activity: Activity) {
        activity.startActivity(Intent(activity, LoginActivity::class.java))
        activity.finish()
    }

    private fun showMainScreen(activity: Activity) {
        activity.startActivity(Intent(activity, MainActivity::class.java))
        activity.finish()
    }
}