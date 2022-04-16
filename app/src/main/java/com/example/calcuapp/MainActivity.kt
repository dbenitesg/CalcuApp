package com.example.calcuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //0->=rien, 1->suma, 2->resta, 3->multi 4->div
    var oper: Int = 0
    var numero1: Double = 0.0
    lateinit var tv_num1: TextView
    lateinit var tv_num2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_num1 = findViewById(R.id.tvnum1)
        tv_num2 = findViewById(R.id.tvnum2)

        val btnEffacer: Button = findViewById(R.id.btnEffacer)
        val btnEgal: Button = findViewById(R.id.btnEgal)

        btnEgal.setOnClickListener{
            var numero2: Double = tv_num2.text.toString().toDouble()
            var resp: Double = 0.0

            when (oper) {
                1 -> resp = numero1 + numero2
                2 -> resp = numero1 - numero2
                3 -> resp = numero1 * numero2
                4 -> resp = numero1 / numero2
            }

            tv_num2.setText(resp.toString())
            tv_num1.setText("")
        }

        btnEffacer.setOnClickListener{
           tv_num1.setText("")
            tv_num2.setText("")
            numero1 = 0.0
            oper = 0
        }
    }

        fun appuieBouton(view: View){
            //val tv_num2: TextView = findViewById(R.id.tvnum2)
            var num2: String = tv_num2.text.toString()

            when(view.id) {
                R.id.btn0 -> tv_num2.setText(num2 + "O")
                R.id.btn1 -> tv_num2.setText(num2 + "1")
                R.id.btn2 -> tv_num2.setText(num2 + "2")
                R.id.btn3 -> tv_num2.setText(num2 + "3")
                R.id.btn4 -> tv_num2.setText(num2 + "4")
                R.id.btn5 -> tv_num2.setText(num2 + "5")
                R.id.btn6 -> tv_num2.setText(num2 + "6")
                R.id.btn7 -> tv_num2.setText(num2 + "7")
                R.id.btn8 -> tv_num2.setText(num2 + "8")
                R.id.btn9 -> tv_num2.setText(num2 + "9")
                R.id.btnPoint -> tv_num2.setText(num2 + ".")
            }
        }

        fun clicOperation(view: View) {
            numero1 = tv_num2.text.toString().toDouble()
            var num2_text: String = tv_num2.text.toString()
            tv_num2.setText("")
            when (view.id) {
                R.id.btnAdition -> {
                    tv_num1.setText(num2_text + "+")
                    oper = 1
                }
                R.id.btnSoustraction -> {
                    tv_num1.setText(num2_text + "-")
                    oper = 2
                }
                R.id.btnMultiplication -> {
                    tv_num1.setText(num2_text + "x")
                    oper = 3
                }
                R.id.btnDivision -> {
                    tv_num1.setText(num2_text + "/")
                    oper = 4
                }

            }

        }
}



