package com.rico.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * Activity ini memungkinkan pegguna untuk mengocok dadu dan
 * menampilkan hasilnya ke layar.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{ rollDice() }
    }

    /**
     * Mengocok dadu dan memperbarui tampilan layar dengan hasilnya
     */
    private fun rollDice() {
        // Membuat objek Dice dengan 6 sisi dan mengocoknya
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Memperbarui layar dengan hasil kocokan dadu
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
