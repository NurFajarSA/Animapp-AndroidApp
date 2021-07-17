package com.nfroject.animapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Animapp (
    var img: Int = 0,
    var name: String = "",
    var className: String = "",
    var ordeName: String = "",
    var familyName: String = "",
    var overview: String =  "",
    var reproduction: String = "",
    var information: String = ""
) : Parcelable