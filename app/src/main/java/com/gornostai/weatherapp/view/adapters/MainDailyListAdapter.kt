package com.gornostai.weatherapp.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gornostai.weatherapp.R
import com.gornostai.weatherapp.business.model.DailyWeatherModel
import com.gornostai.weatherapp.databinding.ItemMainDailyBinding

class MainDailyListAdapter : BaseAdapter<DailyWeatherModel>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyViewHolder =
        DailyViewHolder(ItemMainDailyBinding
            .inflate(LayoutInflater.from(parent.context),parent,false))

    inner class DailyViewHolder(val binding: ItemMainDailyBinding) : BaseViewHolder(binding.root){
        override fun bindView(position: Int) {
            binding.itemDailyDateTv.text = "monday"
            binding.itemDailyMaxTempTv.text = "22°"
            binding.itemDailyMinTempTv.text = "11°"
            binding.itemDailyPopTv.text = "22%"
            binding.itemDailyWeatherConditionIcon.setImageResource(R.drawable.ic_sun)
        }
    }
}