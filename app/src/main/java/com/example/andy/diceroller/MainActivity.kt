package com.example.andy.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var rollButton : Button
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化
        init()
    }

    /** 初始化 */
    fun init() {
        // 初始化 View
        initView()
        // 初始化 Event
        initEvent()
    }

    /** 初始化 View */
    fun initView() {

        rollButton = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
    }

    /** 初始化 Event */
    fun initEvent() {
        rollButton.setOnClickListener {

            rollDice()
        }
    }

    /** 亂數產生 */
    private fun rollDice() {

        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}