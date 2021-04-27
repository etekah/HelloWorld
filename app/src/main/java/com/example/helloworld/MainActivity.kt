package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set text view to a variable so it can be reused
        val numberTextView: TextView = findViewById(R.id.textView)

        // Set initial value
        var numberOnScreen = 0

        // Display initial value
        numberTextView.text = numberOnScreen.toString()

        // Handle button click
        val incrementButton: Button = findViewById(R.id.button)
        incrementButton.setOnClickListener {
            // Increment current number on screen and display incremented value
            numberOnScreen = incrementNumber(numberOnScreen)
            numberTextView.text = numberOnScreen.toString()
        }
    }

    /*
    * This function takes an integer, increments it by 1 and returns the incremented value
    * */
    private fun incrementNumber(number: Int): Int {
        return number + 1
    }
}