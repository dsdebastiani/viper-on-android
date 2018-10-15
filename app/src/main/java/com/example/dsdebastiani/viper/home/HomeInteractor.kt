package com.example.dsdebastiani.viper.home

import android.content.Intent
import com.example.dsdebastiani.viper.data.User

class HomeInteractor(var output: HomeContracts.InteractorOutput?) : HomeContracts.Interactor {

    override fun onDestroy() {
        output = null
    }

    override fun getUser(intent: Intent) {
        intent.getParcelableExtra<User>("USER")?.let {
            output?.onUserFetched(it)
        } ?: output?.onGetUserFailed("Usuário não encontrado!")
    }
}