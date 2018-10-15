package com.example.dsdebastiani.viper.login

import com.example.dsdebastiani.viper.data.User

class LoginInteractor(var output: LoginContracts.InteractorOutput?) : LoginContracts.Interactor {

    override fun authUser(user: User) {
        if (user.username.equals("android") && user.password.equals("1234")){
            output?.onAuthUserSuccess(user)
        } else {
            output?.onAuthUserFailed("Usuário ou senha inválidos!")
        }
    }

    override fun onDestroy() {
        output = null
    }

}