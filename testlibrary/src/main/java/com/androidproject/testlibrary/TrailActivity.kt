package com.androidproject.testlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidproject.testlibrary.databinding.ActivityTrailBinding

class TrailActivity : AppCompatActivity() {
    lateinit var binding : ActivityTrailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrailBinding.inflate(layoutInflater)
        binding.TestActivity
        setContentView(binding.root)


    }
}