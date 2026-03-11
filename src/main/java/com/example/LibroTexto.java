package com.example;

public class LibroTexto extends Libro {
    private String materia;

    public LibroTexto(){
        super();
        this.materia = "";
    }

    public LibroTexto(String titulo, String autor, int numueroEjemplares, int numerosEjemplaresPrestados, String materia) {
        super(titulo, autor, numueroEjemplares, numerosEjemplaresPrestados);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String toString() {
        return "LibroTexto{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numueroEjemplares=" + getNumueroEjemplares() +
                ", numerosEjemplaresPrestados=" + getNumerosEjemplaresPrestados() +
                ", materia='" + materia + '\'' +
                '}';
    }
}