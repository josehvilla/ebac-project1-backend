package com.ebac.proyecto1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Library {

    private List<Book> libros = new ArrayList<>();
    private List<Author> autores = new ArrayList<>();
    private List<User> usuarios = new ArrayList<>();
    private Stream<Book> streamLibros = libros.stream();
    private Stream<Author> streamaAutores = autores.stream();
    private Stream<User> streamUsuarios = usuarios.stream();

    //Agregar libro, autor, usuario
    public void agregarLibro(Book libro) {
        libros.add(libro);
    }

    public void agregarAutor(Author autor) {
        autores.add(autor);
    }

    public void agregarUsuario(User usuario) {
        usuarios.add(usuario);
    }

    //Obtener libro, autor, usuario
    public void obtenerLibro() throws MiExcepcion {
        if (libros.isEmpty()) {
            throw new MiExcepcion("Libro no disponible");
        } else {
            System.out.println(libros.getFirst());
        }
    }

    public void obtenerAutor() throws MiExcepcion {
        if (autores.isEmpty()) {
            throw new MiExcepcion("Autor no disponible");
        } else {
            System.out.println(autores.getFirst());
        }
    }

    public void obtenerUsuario() throws MiExcepcion {
        if (usuarios.isEmpty()) {
            throw new MiExcepcion("Usuario no registrado");
        } else {
            System.out.println(usuarios.getFirst());
        }
    }

    //Actualizar libro, autor, usuario
    public void actualizarLibro(Book libro) throws MiExcepcion {
        if (libros.isEmpty()) {
            throw new MiExcepcion("No se puede actualizar el libro");
        } else {
            libros.set(0, libro);
        }
    }

    public void actualizarAutor(Author autor) throws MiExcepcion {
        if (autores.isEmpty()) {
            throw new MiExcepcion("No se puede actualizar el autor");
        } else {
            autores.set(0, autor);
        }
    }

    public void actualizarUsuario(User usuario) throws MiExcepcion {
        if (usuarios.isEmpty()) {
            throw new MiExcepcion("No se puede actualizar el usuario");
        } else {
            usuarios.set(0, usuario);
        }
    }

    //Eliminar libro, autor, usuario
    public void eliminarLibro(Book libro) {
        libros.remove(libro);
    }

    public void eliminarAutor(Author autor) {
        autores.remove(autor);
    }

    public void eliminarUsuario(User usuario) {
        usuarios.remove(usuario);
    }

    //Lista libros, autores, usuarios
    public void listaLibros() {
        streamLibros.forEach(System.out::println);
    }

    public void listaAutores() {
        streamaAutores.forEach(System.out::println);
    }

    public void listaUsuarios() {
        streamUsuarios.forEach(System.out::println);
    }

    //Lista ordenada libros, autores, usuarios
    public void listaOrdenadaLibros() {
        streamLibros.sorted(Comparator.comparing(Book::getTitulo)).forEach(System.out::println);
    }

    public void listaOrdenadaAutores() {
        streamaAutores.sorted(Comparator.comparing(Author::getNombre)).forEach(System.out::println);
    }

    public void listaOrdenadaUsuarios() {
        streamUsuarios.sorted(Comparator.comparing(User::getNombreUsuario)).forEach(System.out::println);
    }
}
