package com.example.clap.View.iu.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.clap.R

class SignUpActivity:AppCompatActivity() {
    lateinit var registrar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        registrar= findViewById(R.id.registrar)
        registrar.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }
}
}