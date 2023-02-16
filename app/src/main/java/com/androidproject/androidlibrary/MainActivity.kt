package com.androidproject.androidlibrary

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androidproject.androidlibrary.databinding.ActivityMainBinding
import com.androidproject.testlibrary.AlertMessage

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.helloWorldButton.setOnClickListener {
            AlertMessage.showAlertDialogMessage(this, "Test Title", "Test Message") {
                Toast.makeText(this, "Successfully Tested", Toast.LENGTH_SHORT).show()
            }
        }
    }
}