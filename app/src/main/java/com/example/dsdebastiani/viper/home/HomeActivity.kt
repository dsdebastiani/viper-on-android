package com.example.dsdebastiani.viper.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dsdebastiani.viper.R
import com.example.dsdebastiani.viper.data.User
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

class HomeActivity : AppCompatActivity(), HomeContracts.View {

    var presenter: HomeContracts.Presenter? = HomePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onStart() {
        super.onStart()
        presenter?.onStart(intent)
    }

    override fun onDestroy() {
        presenter?.onDestroy()
        presenter = null
        super.onDestroy()
    }

    override fun showError(message: String) {
        Snackbar.make(loginButton, message, Snackbar.LENGTH_SHORT).show()
    }

    override fun updateUiData(user: User) {
        welcomeMessageText.text = String.format("Bem víndo %s", user.username)
    }

}