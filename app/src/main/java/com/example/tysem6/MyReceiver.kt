package com.example.tysem6

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver(){
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Airplane Mode Trigger!!",Toast.LENGTH_LONG).show()
    }
}