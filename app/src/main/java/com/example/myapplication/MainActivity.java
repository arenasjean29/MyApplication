package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcularCirculo(View view)
    {
        Intent i = new Intent(this,MainActivityCirculo.class);
        startActivity(i);
    }
    public void calcularCuadrado(View view)
    {
        Intent i = new Intent(this,MainActivityCuadrado.class);
        startActivity(i);
    }
    public void calcularTriangulo(View view)
    {
        Intent i = new Intent(this,MainActivityTriangulo.class);
        startActivity(i);
    }



}