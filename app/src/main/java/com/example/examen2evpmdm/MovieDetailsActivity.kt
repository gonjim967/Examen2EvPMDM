package com.example.examen2evpmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        var director = findViewById<EditText>(R.id.editTextTextPersonName3)
        var lanzamiento = findViewById<EditText>(R.id.editTextTextPersonName4)
        var boton_siguiente = findViewById<Button>(R.id.button2)
        var boton_atras = findViewById<Button>(R.id.button3)

        var director_pelicula = director.text.toString()
        var lanzamiento_pelicula = lanzamiento.text

        boton_siguiente.setOnClickListener{
            var pasar_movie_display =  Intent(this, MovieDisplayActivity:: class.java)
            startActivity(pasar_movie_display)
        }

        boton_atras.setOnClickListener{
            var pasar_movie_title =  Intent(this, MovieTitleActivity:: class.java)
            startActivity(pasar_movie_title)
        }
    }
}