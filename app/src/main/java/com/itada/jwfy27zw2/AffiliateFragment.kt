package com.itada.jwfy27zw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class AffiliateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_affiliate,container, false)

        val eventBtn = view.findViewById<Button>(R.id.btn_view_events)
        val loginBtn = view.findViewById<Button>(R.id.btn_edit_login)

        eventBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_affiliateFragment_to_eventFragment)
        }

        loginBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_affiliateFragment_to_updateLoginFragment)
        }

        return view    }

}