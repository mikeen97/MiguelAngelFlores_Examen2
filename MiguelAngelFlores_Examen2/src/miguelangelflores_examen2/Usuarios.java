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
public class Usuarios {

    private String nombre;
    private int edad;
    private String usuario;
    private String contrasena;
    private ArrayList<PlayList> ListPlayList = new ArrayList();
    private ArrayList<Cancion> ListFavoritos = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, int edad, String usuario, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<PlayList> getListPlayList() {
        return ListPlayList;
    }

    public void setListPlayList(PlayList e) {
        ListPlayList.add(e);
    }

    public ArrayList<Cancion> getListFavoritos() {
        return ListFavoritos;
    }

    public void setListFavoritos(ArrayList<Cancion> ListFavoritos) {
        this.ListFavoritos = ListFavoritos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
