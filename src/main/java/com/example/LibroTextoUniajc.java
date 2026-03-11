package com.example;

public class LibroTextoUniajc extends LibroTexto {
    private String materia;

    public LibroTextoUniajc() {
        super();
        this.materia = "";
    }

    public LibroTextoUniajc(String titulo, String autor, int numueroEjemplares, int numerosEjemplaresPrestados, String materia) {
        super(titulo, autor, numueroEjemplares, numerosEjemplaresPrestados, materia);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "LibroTextoUniajc{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numueroEjemplares=" + getNumueroEjemplares() +
                ", numerosEjemplaresPrestados=" + getNumerosEjemplaresPrestados() +
                ", materia='" + materia + '\'' +
                '}';
    }
    
}
