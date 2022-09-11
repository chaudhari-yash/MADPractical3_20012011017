package com.example.madpractical3_20012011017

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012011017.databinding.ActivityRegisterBinding

class RegActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setSupportActionBar(binding.toolbar)

        val login = findViewById<TextView>(R.id.logins)

        login.setOnClickListener {

            Intent(this, LoginActivity::class.java).also {startActivity(it)}

            login.movementMethod = LinkMovementMethod.getInstance();

        }
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener{ it ->
            when(it.itemId){
                R.id.bottom_nav_login -> {
                    Intent(this, LoginActivity::class.java).also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}