package com.mycompany.gestor_de_peliculas;

import java.util.List;

/**
 *
 * @author jvaldecr
 */
public class Main {
    
    public static void main(String[] args) {
        GestorPeliculas gestor = new GestorPeliculas();

        // Agregar películas
        gestor.agregarPelicula(1, "Peli 1", true);
        gestor.agregarPelicula(2, "Peli 2", false);
        gestor.agregarPelicula(3, "Peli 3", true);
        gestor.agregarPelicula(4, "Peli 4", true);
        gestor.agregarPelicula(5, "Peli 5", false);
        gestor.agregarPelicula(6, "Peli 6", true);
        gestor.agregarPelicula(7, "Peli 7", true);
        gestor.agregarPelicula(8, "Peli 8", false);
        gestor.agregarPelicula(9, "Peli 9", true);
        
        // Eliminar película por su ID
        gestor.eliminarPelicula(2);

        // Obtener todas las películas
        List<Peliculas> todasPeliculas = gestor.obtenerTodasPeliculas();
        System.out.println("Todas las películas:");
        for (Peliculas pelicula : todasPeliculas) {
            System.out.println("- " + pelicula.getnombrePelicula());
        }

        // Obtener películas disponibles
        List<Peliculas> disponibles = gestor.obtenerPeliculasDisponibles();
        System.out.println("\nPelículas disponibles:");
        for (Peliculas pelicula : disponibles) {
            System.out.println("- " + pelicula.getnombrePelicula());
        }

        // Obtener películas no disponibles
        List<Peliculas> noDisponibles = gestor.obtenerPeliculasNoDisponibles();
        System.out.println("\nPelículas no disponibles:");
        for (Peliculas pelicula : noDisponibles) {
            System.out.println("- " + pelicula.getnombrePelicula());
        }
    }
    
}
    

