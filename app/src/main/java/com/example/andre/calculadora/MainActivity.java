package com.example.andre.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //Definir variables de controles
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    Double[] numero = new Double[20];
    Double resultado;


    //Método al crear la instancia
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignar variables para botones
        Button borrar= (Button) findViewById(R.id.clear);
        Button punto=(Button) findViewById(R.id.point);
        Button cero = (Button) findViewById(R.id.zero);
        Button uno = (Button) findViewById(R.id.one);
        Button dos = (Button) findViewById(R.id.two);
        Button tres =(Button) findViewById(R.id.three);
        Button cuatro = (Button) findViewById(R.id.four);
        Button cinco = (Button) findViewById(R.id.five);
        Button seis = (Button) findViewById(R.id.six);
        Button siete = (Button) findViewById(R.id.seven);
        Button ocho = (Button) findViewById(R.id.eight);
        Button nueve = (Button) findViewById(R.id.nine);
        Button suma= (Button) findViewById(R.id.sum);
        Button resta= (Button) findViewById(R.id.subtraction);
        Button multiplicacion= (Button) findViewById(R.id.multiplication);
        Button division=(Button) findViewById(R.id.division);
        Button igual= (Button) findViewById(R.id.equal);


        //Asociar evento click en cad uno de los botones
        borrar.setOnClickListener(this);
        punto.setOnClickListener(this);
        cero.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);
        igual.setOnClickListener(this);
    }


    //Método click
    @Override
    public void onClick(View v) {

        TextView pantalla = (TextView)findViewById(R.id.result);
        String a = pantalla.getText().toString();
        int seleccion = v.getId();


        try {
            //Seleccion cada caso de boton que se pulse
            switch(seleccion)
            {
                case R.id.clear:
                    pantalla.setText("");
                    decimal = false;
                    break;

                case R.id.point:
                    if(decimal == false){
                        pantalla.setText(a+".");
                        decimal = true;
                    }else{return;}
                    break;

                case R.id.zero:
                    pantalla.setText(a+"0");
                    break;

                case R.id.one:
                    pantalla.setText(a+"1");
                    break;

                case R.id.two:
                    pantalla.setText(a+"2");
                    break;

                case R.id.three:
                    pantalla.setText(a+"3");
                    break;

                case R.id.four:
                    pantalla.setText(a+"4");
                    break;

                case R.id.five:
                    pantalla.setText(a+"5");
                    break;

                case R.id.six:
                    pantalla.setText(a+"6");
                    break;

                case R.id.seven:
                    pantalla.setText(a+"7");
                    break;

                case R.id.eight:
                    pantalla.setText(a+"8");
                    break;

                case R.id.nine:
                    pantalla.setText(a+"9");
                    break;

                case R.id.sum:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;

                case R.id.subtraction:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;

                case R.id.multiplication:
                    multiplicacion = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;

                case R.id.division:
                    break;

                case R.id.equal:

                    numero[1] = Double.parseDouble(a);

                    if (suma == true){
                        resultado = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if (resta == true){
                        resultado = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if (multiplicacion == true){
                        resultado = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }

                    decimal = false;
                    suma = false;
                    resta = false;
                    multiplicacion = false;
                    break;

            }
        }catch(Exception e){
            pantalla.setText("ERROR");
        };
    }
}