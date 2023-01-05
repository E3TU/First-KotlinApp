package com.example.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    var number = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar;
        actionBar!!.title = "Increment decrement counter";
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#12b863")));
        window.statusBarColor = ContextCompat.getColor(this, R.color.transparent);

        val bar = getActionBar();
        val incrementBtn = findViewById<Button>(R.id.incrementbutton);
        val decrementBtn = findViewById<Button>(R.id.decrementbutton);
        val resetBtn = findViewById<Button>(R.id.resetbutton);
        val textView = findViewById<TextView>(R.id.textView);

        incrementBtn.setOnClickListener() {
            number++;
            textView.text = number.toString();
        }

        decrementBtn.setOnClickListener() {
            number--;
            textView.text = number.toString();
        }

        resetBtn.setOnClickListener() {
            number = 0;
            textView.text = number.toString();
        }

    }
}