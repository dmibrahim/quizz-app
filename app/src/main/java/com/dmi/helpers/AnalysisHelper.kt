package com.dmi.helpers

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
 data class AnalysisHelper(val questionId: Int, val question: String, val response:String, val correctAnswer: String, val correct:Int): Parcelable {
}