package com.example.dsdebastiani.viper.login

import com.example.dsdebastiani.viper.data.User

object LoginContracts {
    interface View {
        fun showError(message: String)
        fun showLoading()
        fun dismissLoading()
    }
    interface Interactor {
        fun authUser(user: User)
        fun onDestroy()
    }
    interface Presenter {
        fun validateUser(username: String, password: String)
        fun onDestroy()
    }
    interface InteractorOutput {
        fun onAuthUserSuccess(user: User)
        fun onAuthUserFailed(message: String)
    }
    interface Router {
        fun goToHomeScreen(user: User)
        fun onDestroy(  )
    }

}