package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val tableRow = TableRow(applicationContext);
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
            tableRow.layoutParams = layoutParams;
            val textOne = TextView(this);
            textOne.text = findViewById<TextView>(R.id.textView).text;
            val textTwo = TextView(this);
            textTwo.text = findViewById<TextView>(R.id.textView2).text;
            tableRow.addView(textOne,0);
            tableRow.addView(textTwo, 1);
        }
    }
}