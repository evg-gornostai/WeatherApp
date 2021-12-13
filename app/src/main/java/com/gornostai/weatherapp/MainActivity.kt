package com.gornostai.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gornostai.weatherapp.view.adapters.MainDailyListAdapter
import com.gornostai.weatherapp.view.adapters.MainHourlyListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_hourly_list.apply {
            adapter = MainHourlyListAdapter()
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            setHasFixedSize(true)
        }

        main_daily_list.apply {
            adapter = MainDailyListAdapter()
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            setHasFixedSize(true)
        }






        main_city_name_tv.text = "Polotsk"
        main_date_tv.text = "31 january"
        main_temp.text = "25\u00B0"
        main_weather_condition_description.text = "Clear sky"
        main_temp_min_tv.text = "11"
        main_temp_avg_tv.text = "17"
        main_temp_max_tv.text = "31"
        main_pressure_mu_tv.text = "1024 hPa"
        main_humidity_mu_tv.text = "30%"
        main_wind_speed_mu_tv.text = "2 m/s"
        main_sunrise_mu_tv.text = "5:55"
        main_sunset_mu_tv.text = "22:34"
        main_weather_condition_icon.setImageResource(R.drawable.ic_sun)
        main_weather_image.setImageResource(R.mipmap.cloud3x)
    }
}