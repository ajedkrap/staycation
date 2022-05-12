package id.ajedkrap.staycation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class City(
    val name: String,
    val country: String,
    val currency: String,
    val largeImage: Int,
    val landmarks: ArrayList<Landmark>,
    val mealRegular: String,
    val mealCoffee: String,
    val mealMcd: String,
    val marketEggs: String,
    val marketRice: String,
    val marketMeat: String,
    val marketWater: String,
    val utilBasic: String,
    val utilInternet: String,
    val apartment: String,
    val salaryAvg: String,
): Parcelable
