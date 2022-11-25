package com.itada.jwfy27zw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_login,container, false)

        val regBtn = view.findViewById<Button>(R.id.btn_register)
        val loginBtn = view.findViewById<Button>(R.id.btn_login)

        regBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        loginBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_loginFragment_to_adminFragment)
        }

        return view
    }



}