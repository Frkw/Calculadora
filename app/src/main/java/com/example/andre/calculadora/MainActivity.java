package com.example.andre.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//dfinir variable
    Button uno, dos,tres, cuatro,cinco, seis, siete,ocho, nueve, cero;
    TextView visor;
    @Override
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
        //asignar variable al textview
        visor= (TextView) findViewById(R.id.result);
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
         }

    @Override
    //método click
    public void onClick(View v) {
    //seleccion cada caso de boton que se pulse
        switch(v.getId()) {

            case R.id.one:
                //agregar uno al Textview
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


    }
    }
}

