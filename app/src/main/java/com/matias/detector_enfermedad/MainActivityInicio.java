package com.matias.detector_enfermedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivityInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);

        // navegacion de vistas
        Button btnNavegar = findViewById(R.id.iniciar);
        //Button iniciarPrueba=findViewById(R.id.prueba);
        btnNavegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityInicio.this,MainActivity .class);
                startActivity(intent);
            }
        });
    }
}