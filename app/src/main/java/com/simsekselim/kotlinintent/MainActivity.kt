package com.simsekselim.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
    val text = "First Main Activity"
    val duration = Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun changeActivity(view : View){

        val toast = Toast.makeText(applicationContext,text, duration).show()

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
       val intent = Intent(this,MainActivity2::class.java).apply {
            putExtra("New Page",message)
        }
        startActivity(intent)



    }
}