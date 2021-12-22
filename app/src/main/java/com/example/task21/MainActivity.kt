package com.example.task21

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.task21.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun OnClick(v: View){
        startActivity(Intent(this, Table::class.java))
    }

}