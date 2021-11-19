package com.oguzdogdu.uitestingwithespresso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oguzdogdu.uitestingwithespresso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMain.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}