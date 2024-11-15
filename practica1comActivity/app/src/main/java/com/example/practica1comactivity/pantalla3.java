package com.example.practica1comactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.awt.font.TextAttribute;

public class pantalla3 extends AppCompatActivity {
TextView lblA3Nombre;
TextView lblA3Id;
TextView lblA3Correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        lblA3Nombre = findViewById(R.id.lblA3nombre);
        lblA3Id = findViewById(R.id.lblA3id);
        lblA3Correo = findViewById(R.id.lblA3correo);
        Bundle parametro = getIntent().getExtras();
        lblA3Nombre.setText("Bienvenido: "+parametro.getString("nombre"));
        lblA3Id.setText("Tu ID: "+parametro.getString("id"));
        lblA3Correo.setText("Tu Correo: "+parametro.getString("correo"));

    }
}