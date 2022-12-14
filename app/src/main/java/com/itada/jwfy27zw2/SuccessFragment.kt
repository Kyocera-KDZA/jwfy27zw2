package com.itada.jwfy27zw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class SuccessFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_success,container, false)

        val loginBtn = view.findViewById<Button>(R.id.btn_Reg_Login)

        loginBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_successFragment_to_affiliateFragment)
        }

        return view
    }
}