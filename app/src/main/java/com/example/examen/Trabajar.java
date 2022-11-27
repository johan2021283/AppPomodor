package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trabajar extends AppCompatActivity {
    Button Boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajar);

        Boton2= (Button) findViewById(R.id.Boton2);
        Boton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trabajar.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });


    }
}