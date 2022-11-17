package com.example.clap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.clap.R
import com.example.clap.View.iu.activities.LoginActivity
import com.example.clap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Asociar el activity con el layout
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Configuración para que funcione la animación
        binding.animationView.playAnimation()
        //Trancisión entre la animación y la siguiente activity (4s)
        handler= Handler(Looper.myLooper()!!)
        handler.postDelayed({
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}