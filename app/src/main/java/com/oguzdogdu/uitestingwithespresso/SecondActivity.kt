package com.oguzdogdu.uitestingwithespresso

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oguzdogdu.uitestingwithespresso.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSecond.setOnClickListener {
            onBackPressed()
        }
    }
}