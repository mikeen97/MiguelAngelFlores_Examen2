/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelflores_examen2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Miguel Flores
 */
public class Album implements Serializable{

    private String nombre;
    private String artista;
    private ArrayList<Cancion> ListCanciones = new ArrayList();

    public Album() {
    }

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
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

    public ArrayList<Cancion> getListCanciones() {
        return ListCanciones;
    }

    public void setListCanciones(Cancion e) {
        ListCanciones.add(e);
    }

    @Override
    public String toString() {
        return nombre;
    }

}
