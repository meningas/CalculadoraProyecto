package com.example.meningas.calculadoraproyecto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var valorAnteriorH : Long = 0
    var h:Double = 0.0
    var operando: Boolean = false
    var operacion: String = ""
    var valorAnterior : Double = 0.0

    fun numero(v: View) {
        try {
            val numero = findViewById<Button>(v.id)
            if (operacion == "c") {
                Resultado.text = ""
                operacion = ""
            }
            Resultado.text = Resultado.text.toString() + numero.text.toString()
        }catch (e: NumberFormatException){

        }
    }

    fun sumar (v : View){
        try {
            if (operando == false) {
                valorAnterior = Resultado.text.toString().toDouble()
            }
            if (operando == true) {
                if (operacion == "+") {
                    valorAnterior = valorAnterior + Resultado.text.toString().toDouble()
                }
                if (operacion == "-") {
                    valorAnterior = valorAnterior - Resultado.text.toString().toDouble()
                }
                if (operacion == "*") {
                    valorAnterior = valorAnterior * Resultado.text.toString().toDouble()
                }
                if (operacion == "/") {
                    valorAnterior = valorAnterior / Resultado.text.toString().toDouble()
                }
            }
        }catch (e: NumberFormatException){

        }
        operacion="+"
        operando=true
        Resultado.text = ""
    }

    fun restar (v : View){
        try {
            if (operando == false) {
                valorAnterior = Resultado.text.toString().toDouble()
            }
            if (operando == true) {
                if (operacion == "+") {
                    valorAnterior = valorAnterior + Resultado.text.toString().toDouble()
                }
                if (operacion == "-") {
                    valorAnterior = valorAnterior - Resultado.text.toString().toDouble()
                }
                if (operacion == "*") {
                    valorAnterior = valorAnterior * Resultado.text.toString().toDouble()
                }
                if (operacion == "/") {
                    valorAnterior = valorAnterior / Resultado.text.toString().toDouble()
                }
            }
        }catch (e: NumberFormatException){

        }
        operacion="-"
        operando=true
        Resultado.text=""
    }

    fun multiplicar (v : View){
        try {
            if (operando == false) {
                valorAnterior = Resultado.text.toString().toDouble()
            }
            if (operando == true) {
                if (operacion == "+") {
                    valorAnterior = valorAnterior + Resultado.text.toString().toDouble()
                }
                if (operacion == "-") {
                    valorAnterior = valorAnterior - Resultado.text.toString().toDouble()
                }
                if (operacion == "*") {
                    valorAnterior = valorAnterior * Resultado.text.toString().toDouble()
                }
                if (operacion == "/") {
                    valorAnterior = valorAnterior / Resultado.text.toString().toDouble()
                }
            }
        }catch (e: NumberFormatException){

        }
        operacion="*"
        operando=true
        Resultado.text=""
    }

    fun dividir (v : View){
        try {
            if (operando == false) {
                valorAnterior = Resultado.text.toString().toDouble()
            }
            if (operando == true) {
                if (operacion == "+") {
                    valorAnterior = valorAnterior + Resultado.text.toString().toDouble()
                }
                if (operacion == "-") {
                    valorAnterior = valorAnterior - Resultado.text.toString().toDouble()
                }
                if (operacion == "*") {
                    valorAnterior = valorAnterior * Resultado.text.toString().toDouble()
                }
                if (operacion == "/") {
                    valorAnterior = valorAnterior / Resultado.text.toString().toDouble()
                }
            }
        }catch (e: NumberFormatException){

        }
        operacion="/"
        operando=true
        Resultado.text=""
    }

    fun igual (v : View){
        try {
            if (operacion == "i") {

            } else {
                if (operacion == "+") {
                    valorAnterior = valorAnterior + Resultado.text.toString().toDouble()
                }
                if (operacion == "-") {
                    valorAnterior = valorAnterior - Resultado.text.toString().toDouble()
                }
                if (operacion == "*") {
                    valorAnterior = valorAnterior * Resultado.text.toString().toDouble()
                }
                if (operacion == "/") {
                    valorAnterior = valorAnterior / Resultado.text.toString().toDouble()
                }
            }
        }catch (e: NumberFormatException){

        }
        operando=false
        operacion="i"
        Resultado.text = valorAnterior.toString()
    }

    fun borrar (v : View){
        Resultado.text = "0"
        operacion = "c"
        valorAnterior = 0.0
        operando = false
    }







    fun numeroH(v: View) {
        try {
            val numero = findViewById<Button>(v.id)
            if (operacion == "c") {
                ResultadoH.text = ""
                operacion = ""
            }
            ResultadoH.text = ResultadoH.text.toString() + numero.text.toString()
        }catch (e: NumberFormatException){

        }
    }

    fun sumarH (v : View){
        try {
            if (operando == false) {
                valorAnteriorH = (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operando == true) {
                if (operacion == "+") {
                    valorAnteriorH = valorAnteriorH + (ResultadoH.text.toString().toLong(radix = 16))
                }
                if (operacion == "-") {
                    valorAnteriorH = valorAnteriorH - (ResultadoH.text.toString().toLong(radix = 16))
                }
                if (operacion == "*") {
                    valorAnteriorH = valorAnteriorH * (ResultadoH.text.toString().toLong(radix = 16))
                }
                if (operacion == "/") {
                    valorAnteriorH = valorAnteriorH / (ResultadoH.text.toString().toLong(radix = 16))
                }
            }
        }catch (e: NumberFormatException){

        }
        valorAnteriorH.toString(16).toUpperCase()
        operacion="+"
        operando=true
        ResultadoH.text=""
    }

    fun restarH (v : View){
        try {
            if (operando == false) {
                valorAnteriorH = (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "+") {
                valorAnteriorH = valorAnteriorH + (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "-") {
                valorAnteriorH = valorAnteriorH - (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "*") {
                valorAnteriorH = valorAnteriorH * (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "/") {
                valorAnteriorH = valorAnteriorH / (ResultadoH.text.toString().toLong(radix = 16))
            }
        }catch (e: NumberFormatException){

        }
        valorAnteriorH.toString(16).toUpperCase()
        operacion="-"
        operando=true
        ResultadoH.text=""
    }

    fun multiplicarH (v : View){
        try {
            if (operando == false) {
                valorAnteriorH = (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "+") {
                valorAnteriorH = valorAnteriorH + (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "-") {
                valorAnteriorH = valorAnteriorH - (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "*") {
                valorAnteriorH = valorAnteriorH * (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "/") {
                valorAnteriorH = valorAnteriorH / (ResultadoH.text.toString().toLong(radix = 16))
            }
        }catch (e: NumberFormatException){

        }
        valorAnteriorH.toString(16).toUpperCase()
        operacion="*"
        operando=true
        ResultadoH.text=""
    }

    fun dividirH (v : View){
        try {
            if (operando == false) {
                valorAnteriorH = (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "+") {
                valorAnteriorH = valorAnteriorH + (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "-") {
                valorAnteriorH = valorAnteriorH - (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "*") {
                valorAnteriorH = valorAnteriorH * (ResultadoH.text.toString().toLong(radix = 16))
            }
            if (operacion == "/") {
                valorAnteriorH = valorAnteriorH / (ResultadoH.text.toString().toLong(radix = 16))
            }
        }catch (e: NumberFormatException){

        }
        valorAnteriorH.toString(16).toUpperCase()
        operacion="/"
        operando=true
        ResultadoH.text=""
    }

    fun igualH (v : View){
        try {
            if (operacion == "i") {

            } else {
                if (operacion == "+") {
                    valorAnteriorH = valorAnteriorH + (ResultadoH.text.toString().toLong(radix = 16))
                }
                if (operacion == "-") {
                    valorAnteriorH = valorAnteriorH - (ResultadoH.text.toString().toLong(radix = 16))
                }
                if (operacion == "*") {
                    valorAnteriorH = valorAnteriorH * (ResultadoH.text.toString().toLong(radix = 16))
                }
                if (operacion == "/") {
                    valorAnteriorH = valorAnteriorH / (ResultadoH.text.toString().toLong(radix = 16))
                }
            }
        }catch (e: NumberFormatException){

        }
        operando=false
        operacion="i"
        ResultadoH.text = valorAnteriorH.toString(16).toUpperCase()

    }

    fun borrarH (v : View){
        ResultadoH.text = "0"
        operacion = "c"
        valorAnteriorH = 0
    }
}