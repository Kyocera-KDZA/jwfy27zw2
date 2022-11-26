package com.itada.jwfy27zw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ManageUsersFragment : Fragment() {

    val arr  = ArrayList<String>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_manage_users, container, false)

        val recycler: RecyclerView = RecyclerView(view.context)
        val db : DBHelper = DBHelper(view.context)
        val adapter: EventItemsAdapter




        return view
    }


}