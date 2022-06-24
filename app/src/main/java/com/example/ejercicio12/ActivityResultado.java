package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView txtresul_nom;
    TextView txtresul_ape;
    TextView txtresul_edad;
    TextView txtresul_correo;
    Button btn_Atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtresul_nom = (TextView) findViewById(R.id.txtresul_nom);
        txtresul_ape = (TextView) findViewById(R.id.txtresul_ape);
        txtresul_edad = (TextView) findViewById(R.id.txtresul_edad);
        txtresul_correo = (TextView) findViewById(R.id.txtresul_correo);
        btn_Atras = (Button) findViewById(R.id.btn_Atras);

        txtresul_nom.setText(getIntent().getExtras().getString("nombre"));
        txtresul_ape.setText(getIntent().getExtras().getString("apellido"));
        txtresul_edad.setText(getIntent().getExtras().getString("edad"));
        txtresul_correo.setText(getIntent().getExtras().getString("correo"));
    }

    public void Atras(View view){

        txtresul_nom.setText("");
        txtresul_ape.setText("");
        txtresul_edad.setText("");
        txtresul_correo.setText("");
        Intent at = new Intent(this, MainActivity.class);
        startActivity(at);
    }
}