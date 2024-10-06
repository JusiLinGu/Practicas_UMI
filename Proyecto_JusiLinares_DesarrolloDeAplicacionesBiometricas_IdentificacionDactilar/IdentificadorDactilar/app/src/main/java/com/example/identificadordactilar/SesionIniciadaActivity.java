package com.example.identificadordactilar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SesionIniciadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_iniciada);

        // Encontrar el botón "Regresar"
        Button buttonRegresar = findViewById(R.id.buttonRegresar);

        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finalizar la actividad actual y regresar a MainActivity
                finish();
            }
        });
    }
}
