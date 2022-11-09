package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityCuadrado extends AppCompatActivity {
    EditText lado1,lado2;
    TextView resultado1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cuadrado);
        lado1 = (EditText) findViewById(R.id.lado1);
        lado2 = (EditText) findViewById(R.id.lado2);
        resultado1 = findViewById(R.id.resultadoTri);
    }
    public void calcularCuadrado(View view)
    {
        String ladoPrin = lado1.getText().toString();
        String ladoSec = lado2.getText().toString();

        double lado1double = Double.parseDouble(ladoPrin);
        double lado2double = Double.parseDouble(ladoSec);
        double area;

        area = lado1double * lado2double;

        resultado1.setText("el resultaod es: "+area);
    }

}