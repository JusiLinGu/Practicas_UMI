package com.example.identificadordactilar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.biometric.BiometricPrompt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;  // Asegúrate de importar ImageView
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHora;
    private TextView textViewFecha;
    private ImageView imageViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener la referencia de los TextView e imageView
        textViewHora = findViewById(R.id.textViewHora);
        textViewFecha = findViewById(R.id.textViewFecha);
        imageViewStatus = findViewById(R.id.imageView);

        // Obtener la fecha y hora actual
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String horaActual = simpleDateFormat.format(calendar.getTime());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String fechaActual = simpleDateFormat2.format(calendar.getTime());

        // Mostrar la fecha y hora actual en el TextView
        textViewHora.setText(horaActual);
        textViewFecha.setText(fechaActual);

        // Configurar el botón para escanear huella
        Button buttonEscanear = findViewById(R.id.buttonEscanear);
        buttonEscanear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escanearHuella(); // Llamar a la función para escanear la huella
            }
        });
    }

    private void escanearHuella() {
        Executor executor = ContextCompat.getMainExecutor(this);

        BiometricPrompt biometricPrompt = new BiometricPrompt(this, executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                // Si la autenticación es exitosa, cambiar la imagen y navegar a la siguiente pantalla
                showToast("¡Escaneo de huella dactilar exitoso! Iniciando sesión…");
                imageViewStatus.setImageResource(R.drawable.check); // Cambiar la imagen a check.jpg
                // Aquí puedes iniciar la actividad de bienvenida
                Intent intent = new Intent(MainActivity.this, SesionIniciadaActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAuthenticationError(int errorCode, CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
                imageViewStatus.setImageResource(R.drawable.error); // Cambiar la imagen a error.jpg
                showToast("Escaneo fallido: " + errString);
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
                showToast("Escaneo fallido, huella dactilar no registrada");
            }
        });

        BiometricPrompt.PromptInfo promptInfo = new BiometricPrompt.PromptInfo.Builder()
                .setTitle("Autenticación biométrica")
                .setSubtitle("Inicie sesión utilizando su huella dactilar")
                .setNegativeButtonText("Cancelar")
                .build();

        biometricPrompt.authenticate(promptInfo);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
