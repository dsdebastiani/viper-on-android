package com.example.dsdebastiani.viper.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val username: String,
    val password: String
) : Parcelable