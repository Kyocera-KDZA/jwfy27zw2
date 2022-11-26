package com.itada.jwfy27zw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
            val user = view.findViewById<EditText>(R.id.name).text.toString()
            val pass = view.findViewById<EditText>(R.id.password).text.toString()

            if(user != "" || pass != "") {
                Toast.makeText(view.context, "Logging in...", Toast.LENGTH_SHORT).show()

                it.findNavController().navigate(R.id.action_loginFragment_to_adminFragment)
            }
            else
            {
                Toast.makeText(view.context, "User not found", Toast.LENGTH_LONG).show()
            }
        }
        return view
    }

}