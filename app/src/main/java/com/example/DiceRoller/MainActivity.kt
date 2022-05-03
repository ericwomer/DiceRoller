package com.example.DiceRoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Context
import java.util.*

// widgets
import android.widget.Toast
import android.widget.Button

// project specific imports
import com.example.diceroller.databinding.ActivityMainBinding
import com.example.diceroller.R

public class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    fun rollDice() {
    	var randomInt = Random().nextInt(6) + 1
        var drawableResource = when(randomInt) {
        	1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        
        binding.diceImage.setImageResource(drawableResource)
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        // Remove this line if you don't want AndroidIDE to show this app's logs
        super.onCreate(savedInstanceState)
        
        // setContentView(R.layout.activity_main)
        // val rollButton : Button = findViewById(R.id.roll_button)
        // rollButton.text="Let's Roll"
        // Inflate and get instance of binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        
        // set content view to binding's root
        val view = binding.root
        setContentView(view)
        
        binding.rollButton.text = "Let's Roll"
        binding.rollButton.setOnClickListener {
        	rollDice()
        }
    }
}