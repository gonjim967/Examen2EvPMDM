package com.example.examen2evpmdm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MovieDisplayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_display)

        var nombre_pelicula = intent.getStringExtra("TITULO_PELICULA")
        var duracion_pelicula = intent.getStringExtra("DURACION_PELICULA")
        var director_pelicula = intent.getStringExtra("DIRECTOR_PELICULA")
        var lanzamiento_pelicula = intent.getStringExtra("LANZAMIENTO_PELICULA")

        var m = Movie ("${nombre_pelicula}","${duracion_pelicula}", "${director_pelicula}", "${lanzamiento_pelicula}")

        var boton_volver_principio = findViewById<Button>(R.id.button4)
        var boton_borrar_datos = findViewById<Button>(R.id.button5)
        var textview_nombre = findViewById<TextView>(R.id.textView5)
        var textview_duracion = findViewById<TextView>(R.id.textView6)
        var textview_director = findViewById<TextView>(R.id.textView7)
        var textview_lanzamiento = findViewById<TextView>(R.id.textView8)

        textview_nombre.setText(m.getTitulo())
        textview_duracion.setText(m.getDuracion())
        textview_director.setText(m.getDirector())
        textview_lanzamiento.setText(m.getAño_Lanzamiento())



        boton_volver_principio.setOnClickListener{
            var volver_movie_title =  Intent(this, MovieTitleActivity:: class.java)
            startActivity(volver_movie_title)

        }
        boton_borrar_datos.setOnClickListener{
            eliminarDatos(m)
        }

    }

    fun eliminarDatos(m: Movie){
        m.setTitulo("")
        m.setDuracion("")
        m.setDirector("")
        m.setAño_Lanzamiento("")
    }
}