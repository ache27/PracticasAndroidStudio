package com.example.practica1comactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnSiguiente, btnA1pasaParametro;
EditText txtA1Nombre;
EditText txtA2id;
EditText txtA3Correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSiguiente = findViewById(R.id.btnA1SigAct);
        btnA1pasaParametro= findViewById(R.id.btnA1pasoNombre);
        txtA1Nombre = findViewById(R.id.txtA1Nombre);
        txtA2id = findViewById(R.id.txtA2id);
        txtA3Correo = findViewById(R.id.txtA3correo);

    }
    public void sigPantalla(View v){
        //Definimos el intent
        Intent intent = new Intent(this,pantalla2.class);
        startActivity(intent);
    }
    public void pasoParametro(View v){
        Intent intent = new Intent(this,pantalla3.class);
        intent.putExtra("nombre", txtA1Nombre.getText().toString());
        intent.putExtra("id", txtA2id.getText().toString());
        intent.putExtra("correo", txtA3Correo.getText().toString());
        startActivity(intent);
    }
}