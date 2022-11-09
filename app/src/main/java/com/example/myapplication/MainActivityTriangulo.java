package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTriangulo extends AppCompatActivity {

    EditText altu,ba;
    TextView resuladoT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_triangulo);
        altu=(EditText) findViewById(R.id.alt);
        ba=(EditText) findViewById(R.id.base);
        resuladoT= findViewById(R.id.resultadoTri);
    }
    public void calculoTriangulo(View view)
    {
        String base = ba.getText().toString();
        Double num2 = Double.parseDouble(base);
        String altura = altu.getText().toString();
        Double num1 = Double.parseDouble(altura);


        double rta=0;
        rta = (num2 * num1) / 2;


        resuladoT.setText("el resultado es: "+rta);

    }
    public void Tringulo(View view)
    {
        Intent i = new Intent(this,MainActivityGuardar.class);
        i.putExtra("basep",ba.getText().toString());
        i.putExtra("alturap",altu.getText().toString());
        startActivity(i);


    }
}