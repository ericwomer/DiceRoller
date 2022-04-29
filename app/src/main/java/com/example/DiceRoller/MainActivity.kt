package com.example.DiceRoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Context
import android.widget.Toast
// import com.example.DiceRoller.databinding.ActivityMainBinding
import com.example.DiceRoller.R
import com.itsaky.androidide.logsender.LogSender

public class MainActivity : AppCompatActivity() {
    
    // private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        // Remove this line if you don't want AndroidIDE to show this app's logs
        LogSender.startLogging(this@MainActivity)
        super.onCreate(savedInstanceState)
        // Inflate and get instance of binding
        // binding = ActivityMainBinding.inflate(layoutInflater)
        
        // set content view to binding's root
        // setContentView(binding.root)
        
        // Setup toolbar
        // setSupportActionBar(binding.toolbar)
        
        // Use lambdas
        // binding.fab.setOnClickListener {
        //     Toast.makeText(this@MainActivity, "Replace with your action", Toast.LENGTH_SHORT).show()
        // }
    }
}