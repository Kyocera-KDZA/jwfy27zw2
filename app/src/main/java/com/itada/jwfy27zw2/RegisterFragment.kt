package com.itada.jwfy27zw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_register,container, false)

        val regBtn = view.findViewById<Button>(R.id.btn_register)
        //val user =
        regBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_registerFragment_to_successFragment)
        }


        return view
    }

}