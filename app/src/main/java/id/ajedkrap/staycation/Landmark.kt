package id.ajedkrap.staycation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Landmark(
    val name: String,
    val type: String,
    val picture: Int
): Parcelable