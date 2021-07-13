package com.maksonic.rdpodcast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maksonic.rdpodcast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_RDPodcast)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}