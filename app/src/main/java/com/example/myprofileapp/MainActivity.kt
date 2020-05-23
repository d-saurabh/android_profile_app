package com.example.myprofileapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myprofileapp.controller.DevPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPagerId.adapter = DevPagerAdapter(supportFragmentManager)
        tabLayoutId.setupWithViewPager(viewPagerId)

        tabLayoutId.setTabTextColors(Color.GRAY,Color.parseColor("white"))

    }
}
