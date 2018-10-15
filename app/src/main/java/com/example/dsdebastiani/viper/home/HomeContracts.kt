package com.example.dsdebastiani.viper.home

import android.content.Intent
import androidx.lifecycle.LifecycleObserver
import com.example.dsdebastiani.viper.data.User

object HomeContracts {

    interface View {
        fun showError(message: String)
        fun updateUiData(user: User)
    }

    interface Interactor {
        fun onDestroy()
        fun getUser(intent: Intent)
    }

    interface Presenter : LifecycleObserver {
        fun onDestroy()
        fun onStart(intent: Intent?)
    }

    interface InteractorOutput {
        fun onUserFetched(user: User)
        fun onGetUserFailed(message: String)
    }

    interface Router {
        fun onDestroy(  )
    }
}