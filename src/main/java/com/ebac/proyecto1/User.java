package com.ebac.proyecto1;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String nombreUsuario;
    private String correo;
    private String contraseña;
    private List<Book> librosPrestados = new ArrayList<>();

    public User(String nombreUsuario, String correo, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "User{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", librosPrestados=" + librosPrestados +
                '}';
    }

    //Agregar Libros Prestados
    public void agregarLibrosPrestados(Book libroPrestado) {
        librosPrestados.add(libroPrestado);
    }

    //Eliminar Libros Prestados
    public void eliminarLibrosPrestados(Book libroPrestado) {
        librosPrestados.remove(libroPrestado);
    }
}
