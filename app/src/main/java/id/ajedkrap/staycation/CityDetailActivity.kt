package id.ajedkrap.staycation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import id.ajedkrap.staycation.databinding.ActivityCityDetailBinding

class CityDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityCityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cityData = intent.getParcelableExtra<City>("city_data")

        cityData?.let { setupLandmarkRV(it.landmarks)}
        fillingCityData(cityData)

    }

    private fun setupLandmarkRV(landmarkList: ArrayList<Landmark>){
        val adapter = LandmarkAdapter(landmarkList, applicationContext)
        binding.landmarkRv.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        binding.landmarkRv.adapter = adapter
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun fillingCityData(cityData:City?){
        cityData?.let{ city ->
            with(binding){
                cityLargeImage.setImageDrawable(getDrawable(city.largeImage))
                cityName.text = city.name
                cityLocation.text = city.country
                restaurant.mealsRegular.text = getCurrencyText(city.mealRegular, city.currency)
                restaurant.mealsMcd.text = getCurrencyText(city.mealMcd,city.currency)
                restaurant.mealsCoffee.text = getCurrencyText(city.mealCoffee, city.currency)
                market.marketEggs.text = getCurrencyText(city.marketEggs, city.currency)
                market.marketRice.text = getCurrencyText(city.marketRice, city.currency)
                market.marketMeat.text = getCurrencyText(city.marketMeat, city.currency)
                market.marketWater.text = getCurrencyText(city.marketWater, city.currency)
                utilities.utilBasic.text = getCurrencyText(city.utilBasic, city.currency)
                utilities.utilInternet.text = getCurrencyText(city.utilInternet, city.currency)
                apartment.text = getCurrencyText(city.apartment, city.currency)
                salaryAverage.text = getCurrencyText(city.salaryAvg, city.currency)
            }
        }
    }

    private fun getCurrencyText(amount:String, currency:String):String = "$amount $currency"
}