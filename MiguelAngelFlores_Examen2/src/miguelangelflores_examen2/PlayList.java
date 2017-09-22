/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelflores_examen2;

import java.util.ArrayList;

/**
 *
 * @author Miguel Flores
 */
public class PlayList {

    private String nombre;
    private ArrayList<Cancion> ListCanciones = new ArrayList();

    public PlayList() {
    }

    public PlayList(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getListCanciones() {
        return ListCanciones;
    }

    public void setListCanciones(ArrayList<Cancion> ListCanciones) {
        this.ListCanciones = ListCanciones;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
