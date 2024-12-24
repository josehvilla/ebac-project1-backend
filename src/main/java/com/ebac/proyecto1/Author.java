package com.ebac.proyecto1;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String nombre;
    private String apellido;
    private String biografia;
    private List<Book> librosPublicados = new ArrayList<>();

    public Author(String nombre, String apellido, String biografia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.biografia = biografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", biografia='" + biografia + '\'' +
                ", librosPublicados=" + librosPublicados +
                '}';
    }

    //Agregar Libros Publicados
    public void agregarLibrosPublicados(Book libroPublicado) {
        librosPublicados.add(libroPublicado);
    }

    //Eliminar Libros Publicados
    public void eliminarLibrosPublicados(Book libroPublicado) {
        librosPublicados.remove(libroPublicado);
    }
}
