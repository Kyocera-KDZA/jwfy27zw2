package com.itada.jwfy27zw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class AdminFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_admin,container, false)

        val btnEvent = view.findViewById<Button>(R.id.btn_view_events)
        val btnManageEvent = view.findViewById<Button>(R.id.btn_edit_events)
        val btnUsers = view.findViewById<Button>(R.id.btn_edit_users)

        btnEvent.setOnClickListener {
            it.findNavController().navigate(R.id.action_adminFragment_to_eventFragment)
        }
        btnManageEvent.setOnClickListener {
            it.findNavController().navigate(R.id.action_adminFragment_to_manageEventsFragment)
        }
        btnUsers.setOnClickListener {
            it.findNavController().navigate(R.id.action_adminFragment_to_manageUsersFragment)
        }

        return view
    }

}