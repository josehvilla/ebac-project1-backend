package com.ebac.proyecto1;

public class Contexto {

    public static void main(String[] args) {
        Library libreria = new Library();

        //Agregar libro, autor, usuario
        Book libro = new Book("Harry Potter y la piedra filosofal", "J. K. Rowling", 1997, "8478886540");
        libreria.agregarLibro(libro);

        Author autor = new Author("J. K.", "Rowling", "Es una escritora, productora de cine y guionista británica, conocida por ser la autora de la serie de libros Harry Potter, que han superado los quinientos millones de ejemplares vendidos");
        libreria.agregarAutor(autor);

        User usuario = new User("josehvilla", "jose_hvilla@live.com.mx", "Hola123*");
        libreria.agregarUsuario(usuario);

        //Agregar libro publicado
        autor.agregarLibrosPublicados(libro);

        //Eliminar libro publicado
//        autor.eliminarLibrosPublicados(libro);

        //Agregar libro prestado
        usuario.agregarLibrosPrestados(libro);

        //Eliminar libro prestado
//        usuario.eliminarLibrosPrestados(libro);

        //Obtener libro, autor, usuario
//        try {
//            libreria.obtenerLibro();
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            libreria.obtenerAutor();
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            libreria.obtenerUsuario();
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//        }
//
        //Actualizar libro, autor, usuario
//        Book libro2 = new Book("Los juegos del hambre", "Suzanne Collins", 2008, "6074001901");
//        try {
//            libreria.actualizarLibro(libro2);
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//        }
//
//        Author autor2 = new Author("Suzanne", "Collins", "Es una escritora y guionista estadounidense, creadora de la famosa serie de Los juegos del hambre");
//        try {
//            libreria.actualizarAutor(autor2);
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//        }
//
//        User usuario2 = new User("vylla18", "vylla_18@hotmail.com", "Ver123*");
//        try {
//            libreria.actualizarUsuario(usuario2);
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//        }
//
        //Eliminar libro, autor, usuario
//        libreria.eliminarLibro(libro);
//
//        libreria.eliminarAutor(autor);
//
//        libreria.eliminarUsuario(usuario);

        //Lista libros, autores, usuarios
        libreria.listaLibros();

        libreria.listaAutores();

        libreria.listaUsuarios();

        //Lista ordenada libros, autores, usuarios
//        libreria.listaOrdenadaLibros();
//
//        libreria.listaOrdenadaAutores();
//
//        libreria.listaOrdenadaUsuarios();
    }
}
