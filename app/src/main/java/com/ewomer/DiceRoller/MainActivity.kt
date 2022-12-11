package com.ewomer.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue // only if using var

// Project specific imports
import com.ewomer.diceroller.R

class MainActivity : AppCompatActivity() {

    fun rollDice(): Int {

        var randomInt = Random().nextInt(6) + 1
        var drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { DiceRollerView() }
    }

    @Composable
    fun DiceRollerView() {
        var diceImage by remember { mutableStateOf(R.drawable.empty_dice) }
        /* DO Image */
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Image(
                    painter = painterResource(id = diceImage),
                    contentDescription = ""
                )
            }
            item {
                Button(
                    onClick = { diceImage = rollDice() },
                    elevation = ButtonDefaults.elevation(
                        defaultElevation = 8.dp,
                        pressedElevation = 2.dp
                    )
                ) {
                    Text(text = "Lets Roll")
                }
            }
        }
    }

    @Preview
    @Composable
    fun DiceRollerPreview() {
        DiceRollerView()
    }

}