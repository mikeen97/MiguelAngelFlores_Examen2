/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelflores_examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Miguel Flores
 */
public class AdministrarCosas implements Serializable {

    private ArrayList<Usuarios> ListUsuarios = new ArrayList();
    private ArrayList<Album> ListAlbum = new ArrayList();
    private ArrayList<Cancion> ListCancion = new ArrayList();
    private File archivo = new File("./Usuarios.txt");

    public AdministrarCosas(ArrayList Usuario, ArrayList Album, ArrayList Cancion) {
        this.archivo = new File("./Usuarios.txt");
        ListAlbum = Album;
        ListUsuarios = Usuario;
        ListCancion = Cancion;
    }

    public AdministrarCosas() {
    }

    public ArrayList<Usuarios> getListUsuarios() {
        return ListUsuarios;
    }

    public void setListUsuarios(ArrayList<Usuarios> ListUsuarios) {
        this.ListUsuarios = ListUsuarios;
    }

    public ArrayList<Album> getListAlbum() {
        return ListAlbum;
    }

    public void setListAlbum(ArrayList<Album> ListAlbum) {
        this.ListAlbum = ListAlbum;
    }

    public ArrayList<Cancion> getListCancion() {
        return ListCancion;
    }

    public void setListCancion(ArrayList<Cancion> ListCancion) {
        this.ListCancion = ListCancion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public AdministrarCosas cargarArchivo() {
        FileInputStream a = null;
        ObjectInputStream r = null;
        AdministrarCosas admin = null;
        try {
            a = new FileInputStream(archivo);
            r = new ObjectInputStream(a);
            admin = (AdministrarCosas) r.readObject();
        } catch (Exception e) {
        }
        try {
            a.close();
            r.close();
        } catch (Exception e) {
        }
        return admin;
    }

    public void escribirArchivo() {
        AdministrarCosas a = new AdministrarCosas();
        a.setListAlbum(this.ListAlbum);
        a.setListCancion(this.ListCancion);
        a.setListUsuarios(this.ListUsuarios);
        FileOutputStream m = null;
        ObjectOutputStream r = null;
        try {
            m = new FileOutputStream(archivo);
            r = new ObjectOutputStream(m);
            r.writeObject(a);
        } catch (Exception e) {
        }
        try {
            m.close();
            r.close();
        } catch (Exception e) {
        }
    }
}
