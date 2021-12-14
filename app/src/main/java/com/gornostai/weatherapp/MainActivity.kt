package com.gornostai.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gornostai.weatherapp.databinding.ActivityMainBinding
import com.gornostai.weatherapp.view.adapters.MainDailyListAdapter
import com.gornostai.weatherapp.view.adapters.MainHourlyListAdapter

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mainHourlyList.apply {
            adapter = MainHourlyListAdapter()
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            setHasFixedSize(true)
        }

        binding.mainDailyList.apply {
            adapter = MainDailyListAdapter()
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            setHasFixedSize(true)
        }






        binding.mainCityNameTv.text = "Polotsk"
        binding.mainDateTv.text = "31 january"
        binding.mainTemp.text = "25\u00B0"
        binding.mainWeatherConditionDescription.text = "Clear sky"
        binding.mainTempMinTv.text = "11"
        binding.mainTempAvgTv.text = "17"
        binding.mainTempMaxTv.text = "31"
        binding.mainPressureMuTv.text = "1024 hPa"
        binding.mainHumidityMuTv.text = "30%"
        binding.mainWindSpeedMuTv.text = "2 m/s"
        binding.mainSunriseMuTv.text = "5:55"
        binding.mainSunsetMuTv.text = "22:34"
        binding.mainWeatherConditionIcon.setImageResource(R.drawable.ic_sun)
        binding.mainWeatherImage.setImageResource(R.mipmap.cloud3x)
    }
}