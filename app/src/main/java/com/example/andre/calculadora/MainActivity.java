package com.example.andre.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//dfinir variable
    Button uno, dos,tres, cuatro,cinco, seis, siete,ocho, nueve, cero;
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
                break;

            case R.id.two:
                break;
            case R.id.three:
                break;
            case R.id.four:
                break;
            case R.id.five:
                break;
            case R.id.six:
                break;
            case R.id.seven:
                break;
            case R.id.eight:
                break;
            case R.id.nine:
                break;
            case R.id.zero:
                break;


    }
    }
}

