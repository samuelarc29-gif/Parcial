package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 5, 2);
    
    Libro libro2 = new Libro();
    System.out.println("Ingeresa el título del libro 2:");
    libro2.setTitulo(scanner.nextLine());
    System.out.println("Ingeresa el autor del libro 2:");
    libro2.setAutor(scanner.nextLine());
    System.out.println("Ingeresa el número de ejemplares del libro 2:");
    libro2.setNumueroEjemplares(Integer.parseInt(scanner.nextLine()));
    System.out.println("Ingeresa el número de ejemplares prestados del libro 2:");
    libro2.setNumerosEjemplaresPrestados(Integer.parseInt(scanner.nextLine()));

    LibroTextoUniajc libroTextoUniajc = new LibroTextoUniajc("Programacion Orientada a Objetos", "Samuel Rengifo", 10, 3, "Programación II");
    

    Novela novela = new Novela("Cien años de soledad", "Gabriel García Márquez", 7, 4, "Realismo mágico");

    System.out.println("\n---- DATOS DE LOS OBJETOS-----");

    System.out.println(libro1);
    System.out.println(libro2);
    System.out.println(libroTextoUniajc);
    System.out.println(novela);

    System.out.println("\n---- PRÉSTAMOS Y DEVOLUCIONES -----");

    System.out.println("Préstamo de libro1: " + libro1.prestamo());
    System.out.println("Estado libro1: " + libro1);
    System.out.println("Devolución de libro1: " + libro1.prestamo());
    System.out.println("Estado libro1: " + libro1);

    Libro libroPrueba = new Libro("Libro de prueba", "Autor de prueba", 2, 2);
    System.out.println("Prestamo cuando no hay ejemplares disponibles: " + libroPrueba.prestamo());

    Libro libroPrueba2 = new Libro("Libro de prueba 2", "Autor de prueba 2", 3, 1);
    System.out.println("Devolucion cuando no hay libros prestados: " + libroPrueba2.prestamo());

    scanner.close();



}


    
}
