package com.tesoem.p2comunicacionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class pantalla3 extends AppCompatActivity {
    TextView lblA3Nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        lblA3Nombre = findViewById(R.id.lblA3dato);
        Bundle parametro = getIntent().getExtras();
        lblA3Nombre.setText("Bienvenido: "+parametro.getString("nombre"));
    }
}