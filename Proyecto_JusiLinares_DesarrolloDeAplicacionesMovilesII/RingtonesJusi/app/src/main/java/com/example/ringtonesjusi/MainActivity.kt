package com.example.ringtonesjusi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.net.Uri
import android.os.Environment
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.FileProvider
import java.io.File
import java.io.FileOutputStream
import java.io.IOException


class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    private var puntos = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtener referencia al TextView
        val textViewPuntos: TextView = findViewById(R.id.textView)

        // Actualizar el texto del TextView con la cantidad de puntos actuales (0)
        textViewPuntos.text = "Puntos obtenidos: $puntos"

        mediaPlayer = MediaPlayer.create(this, R.raw.tphone_ringtone)

        val btnPlay1: ImageButton = findViewById(R.id.btnPlay1)
        val btnPlay2: ImageButton = findViewById(R.id.btnPlay2)
        val btnPlay3: ImageButton = findViewById(R.id.btnPlay3)
        val btnPlay4: ImageButton = findViewById(R.id.btnPlay4)
        val btnPlay5: ImageButton = findViewById(R.id.btnPlay5)
        val btnPlay6: ImageButton = findViewById(R.id.btnPlay6)
        val btnPlay7: ImageButton = findViewById(R.id.btnPlay7)
        val btnPlay8: ImageButton = findViewById(R.id.btnPlay8)
        val btnPlay9: ImageButton = findViewById(R.id.btnPlay9)
        val btnPlay10: ImageButton = findViewById(R.id.btnPlay10)

        // Asignar listeners a los botones de reproducción
        assignListener(btnPlay1, "arashi_no_saxophone2")
        assignListener(btnPlay2, "beyond_journeys_end")
        assignListener(btnPlay3, "chala_head_chala")
        assignListener(btnPlay4, "chavo_del_8")
        assignListener(btnPlay5, "fairy_fountain")
        assignListener(btnPlay6, "gusty_garden_galaxy")
        assignListener(btnPlay7, "jurassic_park_3_satellite_phone")
        assignListener(btnPlay8, "pokemon_battle_gold_and_silver")
        assignListener(btnPlay9, "tphone_ringtone")
        assignListener(btnPlay10, "zelda_theme")

        //Seccion de la descarga

        val btnDownload1: ImageButton = findViewById(R.id.btnDownload1)
        val btnDownload2: ImageButton = findViewById(R.id.btnDownload2)
        val btnDownload3: ImageButton = findViewById(R.id.btnDownload3)
        val btnDownload4: ImageButton = findViewById(R.id.btnDownload4)
        val btnDownload5: ImageButton = findViewById(R.id.btnDownload5)
        val btnDownload6: ImageButton = findViewById(R.id.btnDownload6)
        val btnDownload7: ImageButton = findViewById(R.id.btnDownload7)
        val btnDownload8: ImageButton = findViewById(R.id.btnDownload8)
        val btnDownload9: ImageButton = findViewById(R.id.btnDownload9)
        val btnDownload10: ImageButton = findViewById(R.id.btnDownload10)

        assignDownloadListener(btnDownload1, "arashi_no_saxophone2")
        assignDownloadListener(btnDownload2, "beyond_journeys_end")
        assignDownloadListener(btnDownload3, "chala_head_chala")
        assignDownloadListener(btnDownload4, "chavo_del_8")
        assignDownloadListener(btnDownload5, "fairy_fountain")
        assignDownloadListener(btnDownload6, "gusty_garden_galaxy")
        assignDownloadListener(btnDownload7, "jurassic_park_3_satellite_phone")
        assignDownloadListener(btnDownload8, "pokemon_battle_gold_and_silver")
        assignDownloadListener(btnDownload9, "tphone_ringtone")
        assignDownloadListener(btnDownload10, "zelda_theme")

        //Sección de compartir
        val btnShare1: ImageButton = findViewById(R.id.btnShare1)
        val btnShare2: ImageButton = findViewById(R.id.btnShare2)
        val btnShare3: ImageButton = findViewById(R.id.btnShare3)
        val btnShare4: ImageButton = findViewById(R.id.btnShare4)
        val btnShare5: ImageButton = findViewById(R.id.btnShare5)
        val btnShare6: ImageButton = findViewById(R.id.btnShare6)
        val btnShare7: ImageButton = findViewById(R.id.btnShare7)
        val btnShare8: ImageButton = findViewById(R.id.btnShare8)
        val btnShare9: ImageButton = findViewById(R.id.btnShare9)
        val btnShare10: ImageButton = findViewById(R.id.btnShare10)

        assignShareListener(btnShare1, "arashi_no_saxophone2")
        assignShareListener(btnShare2, "beyond_journeys_end")
        assignShareListener(btnShare3, "chala_head_chala")
        assignShareListener(btnShare4, "chavo_del_8")
        assignShareListener(btnShare5, "fairy_fountain")
        assignShareListener(btnShare6, "gusty_garden_galaxy")
        assignShareListener(btnShare7, "jurassic_park_3_satellite_phone")
        assignShareListener(btnShare8, "pokemon_battle_gold_and_silver")
        assignShareListener(btnShare9, "tphone_ringtone")
        assignShareListener(btnShare10, "zelda_theme")

        //Seccion de compartir por diente azul
        val btnBlue1: ImageButton = findViewById(R.id.btnBlue1)
        val btnBlue2: ImageButton = findViewById(R.id.btnBlue2)
        val btnBlue3: ImageButton = findViewById(R.id.btnBlue3)
        val btnBlue4: ImageButton = findViewById(R.id.btnBlue4)
        val btnBlue5: ImageButton = findViewById(R.id.btnBlue5)
        val btnBlue6: ImageButton = findViewById(R.id.btnBlue6)
        val btnBlue7: ImageButton = findViewById(R.id.btnBlue7)
        val btnBlue8: ImageButton = findViewById(R.id.btnBlue8)
        val btnBlue9: ImageButton = findViewById(R.id.btnBlue9)
        val btnBlue10: ImageButton = findViewById(R.id.btnBlue10)

        assignBluetoothShareListener(btnBlue1, "arashi_no_saxophone2")
        assignBluetoothShareListener(btnBlue2, "beyond_journeys_end")
        assignBluetoothShareListener(btnBlue3, "chala_head_chala")
        assignBluetoothShareListener(btnBlue4, "chavo_del_8")
        assignBluetoothShareListener(btnBlue5, "fairy_fountain")
        assignBluetoothShareListener(btnBlue6, "gusty_garden_galaxy")
        assignBluetoothShareListener(btnBlue7, "jurassic_park_3_satellite_phone")
        assignBluetoothShareListener(btnBlue8, "pokemon_battle_gold_and_silver")
        assignBluetoothShareListener(btnBlue9, "tphone_ringtone")
        assignBluetoothShareListener(btnBlue10, "zelda_theme")
    }

    private fun assignListener(button: ImageButton, fileName: String) {
        button.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                button.setImageResource(R.drawable.icon_play)
            } else {
                val resID = resources.getIdentifier(fileName, "raw", packageName)
                mediaPlayer = MediaPlayer.create(this, resID)
                mediaPlayer.start()
                button.setImageResource(R.drawable.icon_pause)
            }
        }
    }

    private fun assignDownloadListener(button: ImageButton, fileName: String) {
        button.setOnClickListener {
            val resID = resources.getIdentifier(fileName, "raw", packageName)
            val audioResource = resources.openRawResource(resID)

            val outputDir = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "RingtonesJusi")
            if (!outputDir.exists()) {
                outputDir.mkdirs()
            }
            val outputFile = File(outputDir, "$fileName.mp3")

            try {
                val outputStream = FileOutputStream(outputFile)
                val buffer = ByteArray(1024)
                var length: Int
                while (audioResource.read(buffer).also { length = it } != -1) {
                    outputStream.write(buffer, 0, length)
                }
                outputStream.flush()
                outputStream.close()
                audioResource.close()

                // Notificar al usuario que la descarga fue exitosa
                Toast.makeText(this, "Descarga completada: ${outputFile.absolutePath}", Toast.LENGTH_SHORT).show()
            } catch (e: IOException) {
                e.printStackTrace()
                // Notificar al usuario si ocurre un error durante la descarga
                Toast.makeText(this, "Error al descargar el archivo", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun assignShareListener(button: ImageButton, fileName: String) {
        button.setOnClickListener {
            // Incrementar el contador de puntos
            ++puntos
            // Obtener referencia al TextView y actualizar el texto con la cantidad de puntos actuales
            val textViewPuntos: TextView = findViewById(R.id.textView)
            textViewPuntos.text = "Puntos obtenidos: $puntos"

            val resID = resources.getIdentifier(fileName, "raw", packageName)
            val audioUri = Uri.parse("android.resource://$packageName/$resID")

            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "audio/mp3"
                putExtra(Intent.EXTRA_STREAM, audioUri)
            }
            Toast.makeText(this, "Felicidades, has ganado un punto", Toast.LENGTH_SHORT).show()
            startActivity(Intent.createChooser(shareIntent, "Compartir audio"))
        }
    }

    private fun assignBluetoothShareListener(button: ImageButton, fileName: String) {
        button.setOnClickListener {
            // Obtener el ID del recurso de audio
            val resID = resources.getIdentifier(fileName, "raw", packageName)
            // Crear la URI del recurso de audio
            val audioUri = Uri.parse("android.resource://$packageName/$resID")

            // Crear el intent para compartir audio
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                // Especificar el tipo de archivo de audio
                type = "audio/*"
                // Adjuntar la URI del audio al intent
                putExtra(Intent.EXTRA_STREAM, audioUri)
            }

            // Especificar que se comparta a través de Bluetooth
            shareIntent.setPackage("com.android.bluetooth")

            // Mostrar el selector de aplicaciones para compartir
            startActivity(Intent.createChooser(shareIntent, "Compartir audio por Bluetooth"))
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}