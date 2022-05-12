package id.ajedkrap.staycation

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ajedkrap.staycation.databinding.ItemLandmarkBinding

class LandmarkAdapter (
    private val listLandmark: ArrayList<Landmark>,
    val context: Context
    ): RecyclerView.Adapter<LandmarkAdapter.LandmarkViewHolder>() {

        lateinit var binding: ItemLandmarkBinding

        inner class LandmarkViewHolder(
            private val itemBinding: ItemLandmarkBinding
        ): RecyclerView.ViewHolder(binding.root){

            @SuppressLint("UseCompatLoadingForDrawables")
            fun bindData(landmark:Landmark){
                with(itemBinding){
                    landmarkPicture.setImageDrawable(context.getDrawable((landmark.picture)))
                    landmarkName.text = landmark.name
                    landmarkType.text = landmark.type
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkViewHolder {
        binding = ItemLandmarkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandmarkViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkViewHolder, position: Int) {
        holder.bindData(listLandmark[position])
    }

    override fun getItemCount(): Int = listLandmark.size
}