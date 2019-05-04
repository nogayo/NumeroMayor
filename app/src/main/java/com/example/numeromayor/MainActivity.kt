package com.example.numeromayor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clickIzquierdo(view: View){

        val boton_izquierdo = findViewById<Button>(R.id.btnIzquierdo)
        val boton_derecho = findViewById<Button>(R.id.btnDerecho)


        val aleatorio = Random()

        val num1 = aleatorio.nextInt(10);
        val num2 = aleatorio.nextInt(10);

        boton_izquierdo.text = num1.toString()
        boton_derecho.text = num2.toString()


    }




















}
