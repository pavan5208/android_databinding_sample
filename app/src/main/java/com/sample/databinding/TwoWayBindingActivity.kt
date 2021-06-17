package com.sample.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sample.databinding.databinding.ActivityTwoWayBindingBinding

class TwoWayBindingActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityTwoWayBindingBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding)
        binding.user = SampleUser()
    }
}

