package com.zuri.mykelcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var zero : Int = 0
        val addition_textview : TextView = findViewById(R.id.addition_textview)
        val addition_button : Button = findViewById(R.id.addition_button)

        addition_button.setOnClickListener { v ->
            zero = addOne(zero)
            addition_textview.setText(""+zero)
        }
    }

    fun addOne(x:Int):Int{
        return x+1
    }
}