package com.example.dsdebastiani.viper.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.dsdebastiani.viper.data.User


class HomePresenter(var view: HomeContracts.View?) : HomeContracts.Presenter, HomeContracts.InteractorOutput {

    var router: HomeContracts.Router? = HomeRouter(view as? AppCompatActivity)
    var interactor : HomeContracts.Interactor? = HomeInteractor(this)

    override fun onStart(intent: Intent?){
        intent?.let {
            interactor?.getUser(it)
        }
    }

    override fun onDestroy() {
        view = null
        router?.onDestroy()
        router = null
    }

    override fun onUserFetched(user: User) {
        view?.updateUiData(user)
    }

    override fun onGetUserFailed(message: String) {
        view?.showError(message)
    }

}