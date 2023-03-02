package com.example.examen2evpmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MovieTitleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_title)

        var titulo = findViewById<EditText>(R.id.editTextTextPersonName)
        var duracion = findViewById<EditText>(R.id.editTextTextPersonName2)
        var boton_siguiente = findViewById<Button>(R.id.button)

        boton_siguiente.setOnClickListener{
            var titulo_pelicula = titulo.text.toString()
            var duracion_pelicula = duracion.text
            var pasar_movie_details =  Intent(this, MovieDetailsActivity:: class.java)
            startActivity(pasar_movie_details)
        }

    }
}