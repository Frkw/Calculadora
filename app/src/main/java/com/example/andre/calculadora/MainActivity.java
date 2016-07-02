package com.example.andre.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declarar variables para botones
        Button  uno = (Button) findViewById(R.id.one);
        Button  dos = (Button) findViewById(R.id.two);
        Button  tres =(Button) findViewById(R.id.three);
        Button  cuatro = (Button) findViewById(R.id.four);
        Button  cinco = (Button) findViewById(R.id.five);
        Button  seis = (Button) findViewById(R.id.six);
        Button  siete = (Button) findViewById(R.id.seven);
        Button  ocho = (Button) findViewById(R.id.eight);
        Button  nueve = (Button) findViewById(R.id.nine);
        Button  cero = (Button) findViewById(R.id.zero);
        //asociar evento click en cad uno de los botones

    }

}

