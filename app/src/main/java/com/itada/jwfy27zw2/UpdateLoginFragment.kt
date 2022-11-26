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


class UpdateLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_update_login, container, false)

        val updateBtn = view.findViewById<Button>(R.id.btn_update)


        updateBtn.setOnClickListener {
           val user = view.findViewById<EditText>(R.id.txt_name).text.toString()
            val pass = view.findViewById<EditText>(R.id.txt_password).text.toString()

            val db = DBHelper(view.context)

            if (user != "" || pass != "") {

                val addUser: Boolean = db.addUsers(user, pass, "Affiliate")

                if (addUser) {
                    Toast.makeText(view.context, "Logging in...", Toast.LENGTH_SHORT).show()

                }
                it.findNavController().navigate(R.id.action_updateLoginFragment_to_loginFragment)

            } else {
                Toast.makeText(view.context, "Input Required!", Toast.LENGTH_LONG).show()
            }


        }
        return view

    }


}