package com.androidproject.testlibrary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androidproject.testlibrary.databinding.ActivityTrailBinding

class TrailActivity : AppCompatActivity() {
    lateinit var binding : ActivityTrailBinding

    lateinit var interfaceTest : TestInterface
    fun doSomething(context: Context){
        val data  = interfaceTest.getDataOnMuteButtonClick()
        interfaceTest.onMuteButtonClickEvent(data)
        Toast.makeText(context,data,Toast.LENGTH_SHORT).show()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.testButton.setOnClickListener {
            binding.newText.text = "New Text Updated 1"
            Toast.makeText(this,"ButtonClicked",Toast.LENGTH_SHORT).show()
        }


    }
}