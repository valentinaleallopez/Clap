package com.example.clap.View.iu.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.clap.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RestoreActivity : AppCompatActivity() {
    lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restore)

        firebaseAuth= Firebase.auth
        val email= findViewById<EditText>(R.id.restoreEmail)
        val restore= findViewById<Button>(R.id.restore)
        restore.setOnClickListener {
            restorePassword(email.text.toString())
        }

    }
        fun restorePassword(email:String){
            firebaseAuth.sendPasswordResetEmail(email)
                .addOnCompleteListener(this){
                        Task->if (Task.isSuccessful){
                    Toast.makeText(baseContext,"Contraseña cambiada con exito",Toast.LENGTH_LONG).show()
                    startActivity(Intent(this,LoginActivity::class.java))
                }else{
                    Toast.makeText(baseContext,"Error",Toast.LENGTH_LONG).show()
                }
                }
    }
}