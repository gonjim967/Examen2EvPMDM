package com.example.examen2evpmdm

class Movie {

    constructor(titulo: String, duracion: String, director: String, año_lanzamiento: String){
        this.titulo=titulo
        this.duracion=duracion
        this.director=director
        this.año_lanzamiento=año_lanzamiento
    }

    private  var titulo=""
    private  var duracion=""
    private  var director=""
    private  var año_lanzamiento=""

    fun getTitulo(): String {
        return titulo
    }

    fun setTitulo (titulo: String){
        this.titulo=titulo
    }

    fun getDuracion (): String{
        return duracion
    }
    fun setDuracion (duracion: String){
        this.duracion=duracion
    }

    fun getDirector (): String {
        return director
    }

    fun setDirector (director: String){
        this.director=director
    }

    fun getAño_Lanzamiento (): String{
        return año_lanzamiento
    }

    fun setAño_Lanzamiento (año_lanzamiento: String){
        this.año_lanzamiento=año_lanzamiento
    }

}