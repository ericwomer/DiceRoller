package com.ewomer.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.tooling.preview.Preview

// widgets

// project specific imports
import com.ewomer.diceroller.R

// ide specific import
// import com.itsaky.androidide.logsender.LogSender

public class MainActivity : AppCompatActivity() {

    // private lateinit var binding: ActivityMainBinding

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

        // binding.diceImage.setImageResource(drawableResource)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // Remove this line if you don't want AndroidIDE to show this app's logs
        // LogSender.startLogging(this@MainActivity)
        super.onCreate(savedInstanceState)

        setContent { MessageCard("Success!") }
        /*
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.text="Let's Roll"
        Inflate and get instance of binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set content view to binding's root
        val view = binding.root
        setContentView(view)

        binding.rollButton.text = "Let's Roll"
        binding.rollButton.setOnClickListener {
            // Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        
        // Setup toolbar
        // setSupportActionBar(binding.toolbar)
        */
    }
    
    @Composable
    fun MessageCard(msg: String) {
                Text(text = msg)
        }

    @Preview
    @Composable
    fun DiceRollerPreview() {
        MessageCard(msg = "Success Again!")
    }
}