package com.example.dsdebastiani.viper.login

import androidx.appcompat.app.AppCompatActivity
import com.example.dsdebastiani.viper.data.User

class LoginPresenter(var view: LoginContracts.View?) : LoginContracts.Presenter, LoginContracts.InteractorOutput {

    var interactor: LoginContracts.Interactor? = LoginInteractor(this)
    var router: LoginContracts.Router? = LoginRouter(view as? AppCompatActivity)

    override fun onDestroy() {
        interactor?.onDestroy()
        router?.onDestroy()
        interactor = null
        router = null
    }

    override fun validateUser(username: String, password: String) {
        if (username.isBlank() || password.isBlank()) {
            view?.showError("Todos os campos são obrigatórios!")
        } else {
            view?.showLoading()
            interactor?.authUser(User(username, password))
        }
    }

    override fun onAuthUserSuccess(user: User) {
        view?.dismissLoading()
        router?.goToHomeScreen(user)
    }

    override fun onAuthUserFailed(message: String) {
        view?.dismissLoading()
        view?.showError("Falha na autenticação. $message")
    }

}