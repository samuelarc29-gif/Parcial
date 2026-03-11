package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private int numueroEjemplares;
    private int numerosEjemplaresPrestados;

    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.numueroEjemplares = 0;
        this.numerosEjemplaresPrestados = 0;

    }
    public Libro(String titulo, String autor, int numueroEjemplares, int numerosEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numueroEjemplares = numueroEjemplares;
        this.numerosEjemplaresPrestados = numerosEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumueroEjemplares() {
        return numueroEjemplares;
    }

    public void setNumueroEjemplares(int numueroEjemplares) {
        this.numueroEjemplares = numueroEjemplares;
    }

    public int getNumerosEjemplaresPrestados() {
        return numerosEjemplaresPrestados;
    }

    public void setNumerosEjemplaresPrestados(int numerosEjemplaresPrestados) {
        this.numerosEjemplaresPrestados = numerosEjemplaresPrestados;
    }

    public boolean prestamo(){
        if (this.numerosEjemplaresPrestados < this.numueroEjemplares){
            this.numerosEjemplaresPrestados++;
            return true;
        }else {
            return false;
        }
    }

    public boolean devolucion(){
        if (this.numerosEjemplaresPrestados > 0){
            this.numerosEjemplaresPrestados--;
            return true;
        }else {
            return false;
        }
    }

    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numueroEjemplares=" + numueroEjemplares +
                ", numerosEjemplaresPrestados=" + numerosEjemplaresPrestados +
                '}';
    }

}