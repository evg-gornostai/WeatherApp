package com.gornostai.weatherapp.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.gornostai.weatherapp.R
import com.gornostai.weatherapp.business.model.HourlyWeatheModel
import com.gornostai.weatherapp.databinding.ItemMainHourlyBinding

class MainHourlyListAdapter : BaseAdapter<HourlyWeatheModel>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyViewHolder =
        HourlyViewHolder(ItemMainHourlyBinding
            .inflate(LayoutInflater.from(parent.context),parent,false))

    inner class HourlyViewHolder(val binding: ItemMainHourlyBinding) : BaseViewHolder(binding.root){
        override fun bindView(position: Int) {
            binding.itemHourlyTimeTv.text = "14:00"
            binding.itemHourlyPopTv.text = "11%"
            binding.itemHourlyTempTv.text = "22°"
            binding.itemHourlyWeatherConditionIcon.setImageResource(R.drawable.ic_sun)
        }

    }

}