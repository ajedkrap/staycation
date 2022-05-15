package id.ajedkrap.staycation

import android.content.Intent
import android.graphics.Point
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import id.ajedkrap.staycation.databinding.ActivityListCityBinding


class ListCityActivity : AppCompatActivity() {

    lateinit var binding: ActivityListCityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListCityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cityList = DataCity().getCities()
        val cityAdapter = CityAdapter(cityList, applicationContext)

        with(binding){
            listCityRv.layoutManager = GridLayoutManager(applicationContext, 2,GridLayoutManager.VERTICAL, false)
            listCityRv.adapter = cityAdapter
        }

        cityAdapter.setClickItemCallback(object : CityAdapter.OnClickItemCallback{
            override fun onClickItemCallback(city: City) {
                val intent = Intent(this@ListCityActivity, CityDetailActivity::class.java)
                intent.putExtra("city_data", city)
                startActivity(intent)
            }
        })
    }


}