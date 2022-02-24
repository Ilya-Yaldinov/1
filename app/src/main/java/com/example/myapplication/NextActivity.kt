package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        val word = intent?.getStringExtra("word")
        val text2 = findViewById<TextView>(R.id.text2)
        val button2 = findViewById<Button>(R.id.button2)
        text2.text = word ?: "хуета чел, переделай"
        button2.setOnClickListener{
            onClick()
        }
    }

    fun onClick(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}