package com.itada.jwfy27zw2

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class EventFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_event, container, false)

        val helper = DBHelper(view.context)
        val db = helper.readableDatabase
        val getUsers = db.rawQuery("SELECT * FROM EVENTS",null)

        Log.i(TAG, getUsers.toString() )

        db.close()
        return view
    }

}