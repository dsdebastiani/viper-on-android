package com.example.dsdebastiani.viper.login

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dsdebastiani.viper.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginContracts.View {

    var presenter: LoginContracts.Presenter? = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton.setOnClickListener {
            onLoginButtonClicked()
        }
    }

    private fun onLoginButtonClicked() {
        presenter?.validateUser(
            usernameEditText.text.toString(),
            passwordEditText.text.toString()
        )
    }

    override fun onDestroy() {
        presenter?.onDestroy()
        presenter = null
        super.onDestroy()
    }

    override fun showError(message: String) {
        Snackbar.make(loginButton, message, Snackbar.LENGTH_SHORT).show()
    }

    override fun showLoading() {
        progressBar?.visibility = View.VISIBLE
    }

    override fun dismissLoading() {
        progressBar?.visibility = View.GONE
    }

}
