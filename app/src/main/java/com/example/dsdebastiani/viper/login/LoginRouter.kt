package com.example.dsdebastiani.viper.login

import androidx.appcompat.app.AppCompatActivity
import com.example.dsdebastiani.viper.data.User
import com.example.dsdebastiani.viper.home.HomeRouter


class LoginRouter(var activity: AppCompatActivity?) : LoginContracts.Router {

    override fun goToHomeScreen(user: User) {
        activity?.let { loginActivity ->
            HomeRouter.getIntentToStart(user, loginActivity)?.let {
                if (loginActivity.packageManager.resolveActivity(it, 0) != null) {
                    loginActivity.startActivity(it)
                }
            }
        }
    }

    override fun onDestroy() {
        activity = null
    }
}