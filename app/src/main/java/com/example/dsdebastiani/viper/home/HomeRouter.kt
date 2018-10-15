package com.example.dsdebastiani.viper.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.dsdebastiani.viper.data.User

class HomeRouter(var activity: AppCompatActivity?) : HomeContracts.Router {

    override fun onDestroy() {
        activity = null
    }

    companion object {
        fun getIntentToStart(user: User, origin: AppCompatActivity): Intent? {
            return Intent(origin, HomeActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtra("USER", user)
            }
        }
    }
}