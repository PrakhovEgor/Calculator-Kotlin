package com.example.myapplication

import android.app.AlertDialog
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var total : EditText = findViewById(R.id.editTextNumber)

        var one: View = findViewById(R.id.one)
        var two: View = findViewById(R.id.two)
        var three: View = findViewById(R.id.three)
        var four: View = findViewById(R.id.four)
        var five: View = findViewById(R.id.five)
        var six: View = findViewById(R.id.six)
        var seven: View = findViewById(R.id.seven)
        var eight: View = findViewById(R.id.eight)
        var nine: View = findViewById(R.id.nine)

        var plus: View = findViewById(R.id.plus)
        var minus: View = findViewById(R.id.minus)
        var mult: View = findViewById(R.id.mult)
        var total2: View = findViewById(R.id.total)

        one.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "1"; total.setText(a)}})
        two.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "2"; total.setText(a)}})
        three.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "3"; total.setText(a)}})
        four.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "4"; total.setText(a)}})
        five.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "5"; total.setText(a)}})
        six.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "6"; total.setText(a)}})
        seven.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "7"; total.setText(a)}})
        eight.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "8"; total.setText(a)}})
        nine.setOnClickListener(object : View.OnClickListener{ override fun onClick(v: View?) {val a = total.text.toString() + "9"; total.setText(a)}})

        plus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var a = total.text.toString()
                val last = a[a.lastIndex].toString()
                if (last == "+" || last == "X" || last == "/" || last == "-"){
                    a = a.substring(0, a.lastIndex) + "+"
                    total.setText(a)
                } else{ total.setText(a + "+") }
            }
        })

        minus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var a = total.text.toString()
                val last = a[a.lastIndex].toString()
                if (last == "+" || last == "X" || last == "/" || last == "-"){
                    a = a.substring(0, a.lastIndex) + "-"
                    total.setText(a)
                } else{ total.setText(a + "-") }
            }
        })



//        var button: View = findViewById(R.id.button)
//        var et: EditText = findViewById(R.id.editTextNumber)
//        var ans: EditText = findViewById(R.id.editTextTextPersonName4)
//
//        button.setOnClickListener {}
    }
}