package com.myanmaritc.mysecondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var calculator= ViewModelProvider(this).get(CalculatorEngine ::class.java)

        btnAdd.setOnClickListener {
            var num1=txtOne.text.toString().toDouble()
            var num2=txtTwo.text.toString().toDouble()
            var out=calculator.setAddResult(num1,num2)
            txtOutput.text=calculator.getAddResult().toString()
        }
        btnSub.setOnClickListener {
            var num1=txtOne.text.toString().toDouble()
            var num2=txtTwo.text.toString().toDouble()
            var out=calculator.setSubResult(num1,num2)
            txtOutput.text=calculator.getSubResult().toString()
        }
        btnMul.setOnClickListener {
            var num1=txtOne.text.toString().toDouble()
            var num2=txtTwo.text.toString().toDouble()
            var out=calculator.setMulResult(num1,num2)
            txtOutput.text=calculator.getMulResult().toString()

        }
        btnDiv.setOnClickListener {
            var num1=txtOne.text.toString().toDouble()
            var num2=txtTwo.text.toString().toDouble()
            var out=calculator.setDivResult(num1,num2)
            txtOutput.text=calculator.getDivResult().toString()
        }


//
//        btnAdd.setOnClickListener {
//            var num1=txtOne.text.toString().toDouble()
//            var num2=txtTwo.text.toString().toDouble()
//            var result:Double=num1+num2
//            txtOutput.text=result.toString()
  //      }
    }
}