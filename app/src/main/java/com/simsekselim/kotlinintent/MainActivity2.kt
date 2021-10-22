package com.simsekselim.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

 val textTwo  = "Second Main Activity"

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message =intent.getStringExtra("New Page")
        val textView = findViewById<TextView>(R.id.textView).apply{
            text = message
        }


    }

    fun changeActivity(view : View){
        val toast = Toast.makeText(applicationContext, textTwo, duration).show()

        val intent = Intent(this,MainActivity::class.java).apply{

        }
        startActivity(intent)





    }



}