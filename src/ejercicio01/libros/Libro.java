package ejercicio01.libros;

/*
 * Copyright (c)
 * Clase para representar un objeto libro
 */
public class Libro {

    // 1. Cración de atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPags;

    // 2. Constructor
    public Libro() {
    }
    public Libro(String ISBN, String titulo, String autor, int numPags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numPags = numPags;
        this.autor = autor;
    }

    // 3. Getters y Setters

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // 4. Métodos
    @Override
    public String toString() {
        return "El libro: " + titulo + " con ISBN: " + ISBN  + " creado por el autor: " + autor + " tiene: " + numPags;
    }
}
