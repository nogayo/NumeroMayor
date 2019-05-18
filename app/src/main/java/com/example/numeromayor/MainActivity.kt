package com.example.numeromayor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var valorContador:Int=0
    var num1:Int = 0
    var num2:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {




        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hacerloAleatorio()
    }




    fun calculoIzquierdo(view: View){

        if (num1>num2){
                valorContador++
        }
        else{
                valorContador--
        }

        contadorTxt.text = "Contador: $valorContador"

        hacerloAleatorio()

    }

    fun calculoDerecho(view: View){

        if (num2>num1){
            valorContador++
        }
        else{
            valorContador--
        }

        contadorTxt.text = "Contador: $valorContador"

        hacerloAleatorio()

    }

    private fun hacerloAleatorio(){



        val boton_izquierdo = findViewById<Button>(R.id.btnIzquierdo)
        val boton_derecho = findViewById<Button>(R.id.btnDerecho)

        val aleatorio = Random()

        num1 = aleatorio.nextInt(10);
        num2 = aleatorio.nextInt(10);


        while(num1 == num2){

            num1 = aleatorio.nextInt(10);
            num2 = aleatorio.nextInt(10);

        }

        boton_izquierdo.text = num1.toString()
        boton_derecho.text = num2.toString()


    }




















}
