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


class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_register, container, false)

        val regBtn = view.findViewById<Button>(R.id.btn_register)

        var user =""
        var pass =""

        val db = DBHelper(view.context)

        //val user =
        regBtn.setOnClickListener {
            user = view.findViewById<EditText>(R.id.txt_name).text.toString()
            pass = view.findViewById<EditText>(R.id.txt_password).text.toString()

            if (user != "" || pass != "") {

                val addUser: Boolean = db.addUsers(user,pass,"Affiliate")

                if(addUser) {
                    Toast.makeText(view.context, "Logging in...", Toast.LENGTH_SHORT).show()

                }
                it.findNavController().navigate(R.id.action_registerFragment_to_successFragment)

            } else {
                Toast.makeText(view.context, "Input Required!", Toast.LENGTH_LONG).show()
            }


        }
        return view

    }

}