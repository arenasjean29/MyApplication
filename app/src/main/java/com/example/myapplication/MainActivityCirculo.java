package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityCirculo extends AppCompatActivity {
    EditText radio;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_circulo);

        radio = (EditText) findViewById(R.id.rd);
        resultado = findViewById(R.id.resultadoTri);
    }

    public void calcularCirculo(View view)
    {
        String radio1 = radio.getText().toString();
        double radioent = Double.parseDouble(radio1);
        double rta=0;
        double pi = 3.1415;


        rta = (radioent * radioent) * pi;

        if (radioent>=0)
        {
            Toast.makeText(this, "numero invalido", Toast.LENGTH_LONG).show();
        }else
        {
            resultado.setText("el resultado es: " + rta);
        }
    }
}