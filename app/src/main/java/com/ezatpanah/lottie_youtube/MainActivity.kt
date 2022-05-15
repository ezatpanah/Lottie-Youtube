package com.ezatpanah.lottie_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezatpanah.lottie_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            binding.ltAnimation.playAnimation()
        }

        binding.btnStop.setOnClickListener {
            binding.ltAnimation.pauseAnimation()

        }

    }
}