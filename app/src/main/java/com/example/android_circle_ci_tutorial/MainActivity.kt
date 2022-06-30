package com.example.android_circle_ci_tutorial

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayoutCircleCI = findViewById<LinearLayout>(R.id.linearLayoutCircleCI)
        val imageViewCircleCI = findViewById<ImageView>(R.id.imageViewCircleCI)
        val textViewCircleCI = findViewById<TextView>(R.id.textViewCircleCI)

        linearLayoutCircleCI.setOnClickListener {
            val randomColor = createRandomHexColor()

            textViewCircleCI.setTextColor(Color.parseColor(randomColor))
            imageViewCircleCI.setColorFilter(Color.parseColor(randomColor))
        }
    }
}

private fun createRandomHexColor(): String {
    val hexList = mutableListOf(
        "0",
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "A",
        "B",
        "C",
        "D",
        "E",
        "F"
    )
    var randomColor = "#"

    repeat(6) {
        randomColor += hexList[(0..(hexList.size - 1)).random()]
    }

    return randomColor
}