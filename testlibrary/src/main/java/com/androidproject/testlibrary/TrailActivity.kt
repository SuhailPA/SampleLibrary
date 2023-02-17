package com.androidproject.testlibrary

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.androidproject.testlibrary.databinding.ActivityTrailBinding

class TrailActivity : AppCompatActivity() {
    lateinit var binding : ActivityTrailBinding
    var view : View ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrailBinding.inflate(layoutInflater)
        binding.TestActivity
        view = binding.root
        returnView(view!!)
        setContentView(binding.root)


    }
    fun returnView(view : View) : View{
        return view
    }
}