package com.mycompany.gestor_de_peliculas;

/**
 *
 * @author jvaldecr
 */
public class Peliculas {
    
    private int idPelicula;
    private String nombrePelicula;
    private boolean Disponible = true;
    
    public Peliculas(int idPelicula, String nombrePelicula, boolean Disponible){
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.Disponible = Disponible;
    }
    //uso de encapsulamiento Getters y Setters
    public int getId(){
    return idPelicula;
    }
    public void setId(int idPelicula){
    this.idPelicula = idPelicula;
    }
    public String getnombrePelicula(){
    return nombrePelicula;
    }
    public void setnombrePelicula(String nombrePelicula){
    this.nombrePelicula = nombrePelicula;
    }
    public boolean getDisponible(){
    return Disponible;
    }
    public void setDisponible(boolean Disponible){
    this.Disponible = Disponible;
    }
    //Metodo para saber si una pelicula esta disponible
    public boolean isDisponible() {
        return Disponible;
    }
    
}
