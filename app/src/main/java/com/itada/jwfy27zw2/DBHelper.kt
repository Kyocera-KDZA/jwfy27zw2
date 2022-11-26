package com.itada.jwfy27zw2

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class DBHelper(context: Context) : SQLiteOpenHelper(context,"myDB",null,1)
{


    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL("CREATE TABLE USERS(USER TEXT, PASSWORD TEXT, TYPE TEXT)")
        db?.execSQL("CREATE TABLE EVENTS(NAME TEXT, DESCRIPTION TEXT, TYPE TEXT)")

        db?.execSQL("INSERT INTO USERS(USER,PASSWORD, TYPE) VALUES('Admin','admin', 'administrator')")
        db?.execSQL("INSERT INTO EVENTS(NAME,DESCRIPTION, TYPE) VALUES('Default','Event description goes here', 'event')")


    }


    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("drop Table if exists USERS")
        db?.execSQL("drop Table if exists EVENTS")

    }

    fun addUsers(name : String, password: String, role: String): Boolean
    {
        val db: SQLiteDatabase = this.writableDatabase

        val contValues: ContentValues = ContentValues()

        contValues.put("name",name)
        contValues.put("pass",password)
        contValues.put("role",role)

        val outcome :Long = db.insert("USERS",null, contValues)


        return outcome >= 0
    }

    fun getUsers(): Cursor {
        val db: SQLiteDatabase = this.writableDatabase

        return db.rawQuery("SELECT * FROM USERS", null)

    }


}