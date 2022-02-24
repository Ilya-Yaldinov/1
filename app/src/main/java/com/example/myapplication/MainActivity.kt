package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            pressButton()
        }
    }

    fun pressButton(){
        val edit = findViewById<EditText>(R.id.edit)
        if (edit.text.isEmpty()){
            val button = Toast.makeText(this, "Введите текст", Toast.LENGTH_SHORT)
            button.show()
        } else{
            val intent = Intent(this, NextActivity::class.java)
            intent.putExtra("word", edit.text.toString())
            startActivity(intent)
        }
    }
}
