package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {



    lateinit var diceImage : ImageView
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = this.findViewById(R.id.roll_button)

        rollButton.setOnClickListener { rollDice() }

    }

    @SuppressLint("SetTextI18n")
    private fun rollDice() {

        //val randomInt1 = Random().nextInt(6) + 1
        //val randomInt2 = Random().nextInt(6) + 1
        //val randomInt3 = Random().nextInt(6) + 1

        //val drawableResource = when (randomInt1) {
        //    1 -> R.drawable.dice_1
        //    2 -> R.drawable.dice_2
        //    3 -> R.drawable.dice_3
        //    4 -> R.drawable.dice_4
        //    5 -> R.drawable.dice_5
        //    else -> R.drawable.dice_6
        //}

        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage1: ImageView = findViewById(R.id.dice_image1)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        //resultText.text = randomInt.toString()
        diceImage.setImageResource( dice() )
        diceImage1.setImageResource( dice() )
        diceImage2.setImageResource( dice() )


        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    private fun dice(): Int{
        val randomInt1 = Random().nextInt(6) + 1

        val drawableResource = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource

    }

}

private fun ImageView.setImageResource(function: () -> Int) {

}
