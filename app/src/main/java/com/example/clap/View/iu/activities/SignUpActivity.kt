package com.example.clap.View.iu.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.clap.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignUpActivity:AppCompatActivity() {
    lateinit var registrar: Button
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        firebaseAuth= Firebase.auth

        registrar= findViewById(R.id.registrar)
        val name= findViewById<EditText>(R.id.signupName)
        val lastName= findViewById<EditText>(R.id.signupLastName)
        val email= findViewById<EditText>(R.id.signupEmail)
        val password= findViewById<EditText>(R.id.signupPassword)

        registrar.setOnClickListener {
            createUser(email.text.toString(),password.text.toString())
        }
    }

        fun createUser(email:String, password:String){

            firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this){
                     Task->if (Task.isSuccessful){
                     startActivity(Intent(this,LoginActivity::class.java))
                }else{
                    Toast.makeText(applicationContext,"Error",Toast.LENGTH_LONG).show()
                }
                }
        }

}
