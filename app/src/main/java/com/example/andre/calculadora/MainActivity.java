package com.example.andre.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//dfinir variables de controles
    //botones
    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, coma, borrar, suma, resta, multi, divi, igual;
    //textview
    TextView visor, acumulador;

    //variables que almacenan resultados
   public double  resultado, valor1=0, valor2=0;
    //variable para tipo de signo
    char signo ='+';
    char anterior ='=';
    boolean inicialsuma=true, inicialresta = true, inicialmulti=true,inicialdivi=true;
    @Override
    //método al crear la instancia
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asignar variables para botones
          uno = (Button) findViewById(R.id.one);
          dos = (Button) findViewById(R.id.two);
          tres =(Button) findViewById(R.id.three);
          cuatro = (Button) findViewById(R.id.four);
          cinco = (Button) findViewById(R.id.five);
          seis = (Button) findViewById(R.id.six);
          siete = (Button) findViewById(R.id.seven);
          ocho = (Button) findViewById(R.id.eight);
          nueve = (Button) findViewById(R.id.nine);
          cero = (Button) findViewById(R.id.zero);
          coma=(Button) findViewById(R.id.coma);
          borrar= (Button) findViewById(R.id.clear);
          suma= (Button) findViewById(R.id.sum);
          resta= (Button) findViewById(R.id.subtraction);
          multi= (Button) findViewById(R.id.multiplication);
          divi=(Button) findViewById(R.id.division);
          igual= (Button) findViewById(R.id.equal);

        //asignar variable a los textview
        visor= (TextView) findViewById(R.id.display);
        acumulador= (TextView) findViewById(R.id.accumulator);
        //asociar evento click en cad uno de los botones
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        cero.setOnClickListener(this);
        coma.setOnClickListener(this);
        borrar.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
        igual.setOnClickListener(this);
         }

    @Override
    //método click
    public void onClick(View v) {
    //seleccion cada caso de boton que se pulse
        switch(v.getId()) {

            case R.id.one:
                //agregar uno al Textview visor
                visor.append("1");
                break;

            case R.id.two:

                visor.append("2");
                break;
            case R.id.three:
                visor.append("3");
                break;
            case R.id.four:
                visor.append("4");
                break;
            case R.id.five:
                visor.append("5");
                break;
            case R.id.six:
                visor.append("6");
                break;
            case R.id.seven:
                visor.append("7");
                break;
            case R.id.eight:
                visor.append("8");
                break;
            case R.id.nine:
                visor.append("9");
                break;
            case R.id.zero:
                visor.append("0");
                break;
            case R.id.clear:
            {
                //se borra contenido textviews
                visor.setText("");
                acumulador.setText("");
                inicialsuma= true;
                inicialmulti=true;
                signo='+';
                anterior='=';
             break;
            }
            case R.id.sum: {
                //ejecuto método calcular pasando como parámetro el símbolo "+"
                Calcular('+');
                break;
            }

            case R.id.subtraction: {
                //ejecuto método calcular pasando como parámetro el símbolo "-"
                Calcular('-');
                break;
            }
            case R.id.multiplication: {
                //ejecuto método calcular pasando como parámetro el símbolo "*"
                Calcular('*');
                break;
            }
            case R.id.division: {
                //ejecuto método calcular pasando como parámetro el símbolo "/"
                Calcular('/');
                break;
            }
            case R.id.equal: {
                //ejecuto método calcular pasando como parámetro el símbolo "="
                Calcular('=');
                break;
            }
    }
    }

    //método que calcula operaciones
    public void Calcular(char sign){

//valores iniciales dependiendo del signo
         if ((inicialsuma==true)&& (sign == '+'))
          valor1=0;
        if ((inicialmulti==true)&& (sign == '*'))
            valor1=1;




        //almacena parcialmente numero antes de ejecutar operacion
        resultado = valor1;


     // convierte el texto del visor a string

    String visor_a_cadena = visor.getText().toString();
        // convierte el string a double
        valor2 = Double.parseDouble(visor_a_cadena);
        //dependiendo del signo introducido ejecutar operación
            if(sign == '+') {
                // si es "+", suma ambas variables y asigna a resultado
                resultado = valor1 + valor2;
                //anterior signo antes de ejecutar igual
                anterior = sign;
                inicialsuma= false;
            }
            else if (sign == '-') {
                // si es "-", resta ambas variables y asigna a resultado
                resultado = valor1 - valor2;
                //anterior signo
                anterior = sign;

            }
            else if (sign == '*') {
                // si es "*", multiplica ambas variables y asigna a resultado
                resultado = valor1 * valor2;
                anterior = sign;
                inicialmulti=false;
            }
            else if (sign == '/') {
                // si es "/", divide ambas variables y asigna a resultado
                resultado = valor1 / valor2;
                anterior = sign;
            }
        //despues de hacer la operación queda el resultado en valor1
        valor1 = resultado;
        //modificamos la variable de signo con la que definamos
        signo = sign;

        //si pulsamos el botón igual miramos el anterior signo para ejecutar operacion
        if(sign == '='){

            if(anterior == '+') {
                // si es "+", suma ambas variables y asigna a resultado
                resultado = valor1 + valor2;
                //anterior signo antes de ejecutar igual

            }
            else if (anterior == '-') {
                // si es "-", resta ambas variables y asigna a resultado
                resultado = valor1 - valor2;
                //anterior signo

            }
            else if (anterior == '*') {
                // si es "*", multiplica ambas variables y asigna a resultado
                resultado = valor1 * valor2;
                anterior = sign;
            }
            else if (anterior == '/') {
                // si es "/", divide ambas variables y asigna a resultado
                resultado = valor1 / valor2;
                anterior = sign;
            }
            //despues de hacer la operación queda el resultado en valor1
            valor1 = resultado;
            anterior='=';
            //sacar resultado en ambos textview


            visor.setText("" + valor1);
            acumulador.setText("" + valor1);
            valor1=0;
            inicialsuma= true;
            inicialmulti=true;
        }
          //si no pulso boton igual
          else{
            //borro el contenido visor principal
            visor.setText("");
            // muestro en el otro textview el valor con el signo
            acumulador.setText("" + valor1 + signo);
            inicialsuma= false;
            inicialmulti=false;

        }

    }

}

