
package com.mycompany.gestor_de_peliculas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorPeliculas {
    //Creamos una lista de peliculas
    private List<Peliculas> peliculas;
    
    public GestorPeliculas() {
        this.peliculas = new ArrayList<>();
    }
    //Método para agregar películas
    public void agregarPelicula(int id, String nombre, boolean disponible) {
        Peliculas nuevaPelicula = new Peliculas(id, nombre, disponible);
        String dispon;
        peliculas.add(nuevaPelicula);
        if(disponible){
            dispon = "con disponibilidad";
        }else{
            dispon = "sin disponibilidad";
        }
        System.out.println
        ("Pelicula agregada: " + nuevaPelicula.getnombrePelicula() + 
                " con Id: " + id + " " + dispon );
    }
    // Método para eliminar una película por su ID
    public void eliminarPelicula(int id) {
        Iterator<Peliculas> iter = peliculas.iterator();
        while (iter.hasNext()) {
            Peliculas pelicula = iter.next();
            if (pelicula.getId() == id) {
                iter.remove();
                System.out.println("Pelicula eliminada: " + pelicula.getnombrePelicula());
            }
        }
    }

    // Método para obtener todas las películas
    public List<Peliculas> obtenerTodasPeliculas() {
        return peliculas;
    }

    // Método para obtener las películas disponibles
    public List<Peliculas> obtenerPeliculasDisponibles() {
        List<Peliculas> disponibles = new ArrayList<>();
        for (Peliculas pelicula : peliculas) {
            if (pelicula.isDisponible()) {
                disponibles.add(pelicula);
            }
        }
        return disponibles;
    }

    // Método para obtener las películas no disponibles
    public List<Peliculas> obtenerPeliculasNoDisponibles() {
        List<Peliculas> noDisponibles = new ArrayList<>();
        for (Peliculas pelicula : peliculas) {
            if (!pelicula.isDisponible()) {
                noDisponibles.add(pelicula);
            }
        }
        return noDisponibles;
    }

    
}
