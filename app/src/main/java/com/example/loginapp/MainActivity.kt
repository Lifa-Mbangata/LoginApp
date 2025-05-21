package com.example.loginapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = UserDatabase.getDatabase(this)

        setContent {
            setContent {
                val db = UserDatabase.getDatabase(this)
                AppNavHost(db = db)
            }

        }
    }
}



