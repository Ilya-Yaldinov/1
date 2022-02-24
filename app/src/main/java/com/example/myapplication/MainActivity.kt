package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText
import org.w3c.dom.Text
import java.io.Console

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pressButton(view: View){
        val edit = findViewById<EditText>(R.id.edit)
        val view = findViewById<TextView>(R.id.view)
        if (edit.text.isNotEmpty()){
            view.text = edit.getText().toString()
        }else{
            val button = Toast.makeText(this, "Введите текст", Toast.LENGTH_SHORT)
            button.show()
        }
    }
}