package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;

public class MainActivityGuardar extends AppCompatActivity {
    String num1;
    String num2;
    TextView b,a;
    EditText nombreP,figura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_guardar);
        b=findViewById(R.id.textViewB);
        a=findViewById(R.id.textViewA);
        nombreP=(EditText) findViewById(R.id.editProyecto);
        figura=(EditText) findViewById(R.id.editFigura);


        Intent reci =getIntent();
        num1 = reci.getStringExtra("basep");
        num2 = reci.getStringExtra("alturap");

        a.setText("alura: "+num2);
        b.setText("base: "+num1);

    }
    public void guardarD(View view)
    {
        conexioBD basedeDatos = new conexioBD(this,"Gfiguras", null, 1);
        SQLiteDatabase editableBD = basedeDatos.getWritableDatabase();

        String nombreProyecto= nombreP.getText().toString();
        String nombreFigura = figura.getText().toString();

        ContentValues paquete = new ContentValues();
        paquete.put("nombreProyecto",nombreProyecto);
        paquete.put("nombreFigura",nombreFigura);


        paquete.put("nombreProyecto", nombreProyecto);
        paquete.put("nombreFigura", nombreFigura);

        editableBD.insert("figura", null, paquete );
        editableBD.close();
        Toast.makeText(this, "guardado Correctamente", Toast.LENGTH_LONG).show();
    }
    public void consultarD(View view)
    {
        conexioBD basedeDatos = new conexioBD(this,"Gfiguras", null, 1);
        SQLiteDatabase editableBD = basedeDatos.getWritableDatabase();
        String nombreProyect = nombreP.getText().toString();
        if (!nombreProyect.isEmpty())
        {
            Cursor veri=editableBD.rawQuery("select NProyecto, NFigura from figura where NProyecto like '%"+nombreProyect+"%'",null);
            if (veri.moveToFirst())
            {
                nombreP.setText(veri.getString(0));
                figura.setText(veri.getString(1));
                editableBD.close();

            }else
            {
                Toast.makeText(this, "no existe el proyecto", Toast.LENGTH_LONG).show();
            }
        }else
        {
            Toast.makeText(this, "complete los campos", Toast.LENGTH_LONG).show();
        }
    }
}