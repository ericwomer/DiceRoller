package com.ewomer.DiceRoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

// project specific imports
import com.ewomer.diceroller.databinding.ActivityMainBinding
import com.ewomer.diceroller.R

class MainActivity : AppCompatActivity() {
    
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
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        
        // set content view to binding's root
        val view = binding.root
        setContentView(view)

        val rollButton = binding.rollButton
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
        	rollDice()
        }
    }
}