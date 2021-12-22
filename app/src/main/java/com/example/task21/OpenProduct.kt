package com.example.task21

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.task21.databinding.ActivityOpenProductBinding

class OpenProduct : Activity() {

    private lateinit var binding: ActivityOpenProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOpenProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
        findViewById<TextView>(R.id.name).text = intent.getStringExtra("name")
        findViewById<TextView>(R.id.name).setCompoundDrawablesWithIntrinsicBounds(
            intent.getIntExtra(
                "icon_id",
                R.drawable.borsch
            ), 0, 0, 0
        );
        findViewById<ImageView>(R.id.image).setImageResource(
            intent.getIntExtra(
                "image_id",
                R.drawable.borsch_big
            )
        )
        findViewById<TextView>(R.id.description).text = intent.getStringExtra("description")
    }

}