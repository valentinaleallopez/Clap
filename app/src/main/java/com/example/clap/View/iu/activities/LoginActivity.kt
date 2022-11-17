package com.example.clap.View.iu.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.clap.R
import com.example.clap.databinding.ActivityMainBinding


class LoginActivity:AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var signup: Button
    lateinit var home: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        signup= findViewById(R.id.creaCuenta)
        signup.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

        home= findViewById(R.id.ingresar)
        home.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }

    }
}