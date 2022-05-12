package id.ajedkrap.staycation

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ajedkrap.staycation.databinding.ItemCityBinding

class CityAdapter (
    val listCity: ArrayList<City>,
    val context:Context
    ): RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    private lateinit var binding:ItemCityBinding
    private lateinit var clickUseCase: OnClickItemCallback
    fun setClickItemCallback(onClickItemCallback: OnClickItemCallback){
        this.clickUseCase = onClickItemCallback
    }

    inner class CityViewHolder (
        private val itemBinding: ItemCityBinding
    ): RecyclerView.ViewHolder(binding.root){
           @SuppressLint("UseCompatLoadingForDrawables")
           fun bindData(city:City){
               with(itemBinding){
                   cityThumbnail.setImageDrawable(context.getDrawable(city.landmarks[0].picture))
                   cityName.text = city.name
                   cityLocation.text = city.country
                   root.setOnClickListener{
                       clickUseCase.onClickItemCallback(city)
                   }
               }
           }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        binding = ItemCityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CityViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.bindData(listCity[position])
    }

    override fun getItemCount(): Int = listCity.size

    interface OnClickItemCallback {
        fun onClickItemCallback(city: City)
    }


}