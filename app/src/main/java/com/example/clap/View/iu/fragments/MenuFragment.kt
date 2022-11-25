package com.example.clap.View.iu.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.clap.R

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cardProfile= view.findViewById<CardView>(R.id.fragPerfil)
        cardProfile.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_profileFragment)
        }

        val cardPost= view.findViewById<CardView>(R.id.fragPublicaciones)
        cardPost.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_postFragment)
        }
        val cardNotification= view.findViewById<CardView>(R.id.fragReportes)
        cardNotification.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_notificationFragment)
        }

        val cardMap= view.findViewById<CardView>(R.id.fragMapa)
        cardMap.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_mapFragment)
        }

        val cardSettings= view.findViewById<CardView>(R.id.fragConfiguracion)
        cardSettings.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_settingsFragment)
        }

        val cardLogout= view.findViewById<CardView>(R.id.fragSalir)
        cardLogout.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_logoutFragment)
        }

    }
}