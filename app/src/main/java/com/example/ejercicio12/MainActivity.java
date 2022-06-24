package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt_Resultado;
    EditText txt_Nombre, txt_Apellido, txt_Edad, txt_Correo;
    Button btn_Enviar;
    Datos datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Nombre = (EditText) findViewById(R.id.txt_Nombre);
        txt_Apellido = (EditText) findViewById(R.id.txt_Apellido);
        txt_Edad = (EditText) findViewById(R.id.txt_Edad);
        txt_Correo = (EditText) findViewById(R.id.txt_Correo);
        txt_Resultado = (TextView) findViewById(R.id.txt_Resultado);

    }

    public void SendData (View view){

  // datos = new Datos(txt_Nombre.getText().toString(), txt_Apellido.getText().toString(), Integer.parseInt(txt_Edad.getText().toString()), txt_Correo.getText().toString());
       // Datos datos = new Datos("","", 0,"ss");
        datos = new Datos (txt_Nombre.getText().toString(), txt_Apellido.getText().toString(), Integer.parseInt(txt_Edad.getText().toString()), txt_Correo.getText().toString());
        Intent i = new Intent(getApplicationContext(), ActivityResultado.class);
        i.putExtra("nombre", datos.getNombre());
        i.putExtra("apellido", datos.getApellido());
        i.putExtra("edad", txt_Edad.getText().toString());
        i.putExtra("correo", datos.getCorreo());
        startActivity(i);

        // Toast.makeText(this, "El nombre es: " + datos.edad, Toast.LENGTH_LONG).show();

    }
}