package com.example;

public class Novela extends Libro {
    private String genero;

    public Novela() {
        super();
        this.genero = "";
    }

    public Novela(String titulo, String autor, int numueroEjemplares, int numerosEjemplaresPrestados, String genero) {
        super(titulo, autor, numueroEjemplares, numerosEjemplaresPrestados);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Novela{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numueroEjemplares=" + getNumueroEjemplares() +
                ", numerosEjemplaresPrestados=" + getNumerosEjemplaresPrestados() +
                ", genero='" + genero + '\'' +
                '}';
    }
    
}
