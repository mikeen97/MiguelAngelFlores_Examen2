/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelflores_examen2;

import java.io.Serializable;

/**
 *
 * @author Miguel Flores
 */
public class Cancion implements Serializable{

    private String nombre;
    private String artista;
    private double duracion;
    
    public Cancion() {
    }

    public Cancion(String nombre, String artista, double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
