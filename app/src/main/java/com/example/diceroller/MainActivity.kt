package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener { rollDice() }

    }

    @SuppressLint("SetTextI18n")
    private fun rollDice() {
        val total: TextView = findViewById(R.id.total)

        val num1 = Random().nextInt(6) + 1
        val num2 = Random().nextInt(6) + 1
        val num3 = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        resultText.text = "Dice Rolled!"
        resultText.text = num1.toString()
        resultText1.text = num2.toString()
        resultText2.text = num3.toString()
        val sum = num1+num2+num3
        total.text = "Total = " + sum.toString()

    }

}
