package com.luisvillalobos.dev.materialdesignexercises.design

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Option(
    val name: String,
    val resource: Int
): Parcelable