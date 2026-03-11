SAMUEL ANDRES RENGIFO CORTES

    Caso 1: si la clase es final
    public final class Libro{}
    Una clase final no puede ser heredada.
    Public class Novela extends Libro{}

    caso 2: Constructor inaccesible
    public class Libro {
    private Libro() {
    }

    Si el constructor es private, una subclase no puede llamar a super() desde afuera de la misma clase.

public class LibroTexto extends Libro {
    public LibroTexto() {
        super(); // Error
    }
}
}

2 atributos nuevos y un metodo adicional

Atributos nuevos

int anioPublicacion
String isbn

Metodo adicional

public int ejemplaresDisponibles() {
    return numeroEjemplares - numeroEjemplaresPrestados;
};

## DIAGRAMA DE CLASES

```mermaid
classDiagram

    class Libro {
        - String titulo
        - String autor
        - int numueroEjemplares
        - int numerosEjemplaresPrestados
        + Libro()
        + Libro(String, String, int, int)
        + String getTitulo()
        + void setTitulo(String)
        + String getAutor()
        + void setAutor(String)
        + int getNumueroEjemplares()
        + void setNumueroEjemplares(int)
        + int getNumerosEjemplaresPrestados()
        + void setNumerosEjemplaresPrestados(int)
        + boolean prestamo()
        + boolean devolucion()
        + String toString()
    }

    class LibroTexto {
        - String materia
        + LibroTexto()
        + LibroTexto(String, String, int, int, String)
        + String getMateria()
        + void setMateria(String)
        + String toString()
    }

    class LibroTextoUniajc {
        - String materia
        + LibroTextoUniajc()
        + LibroTextoUniajc(String, String, int, int, String)
        + String getMateria()
        + void setMateria(String)
        + String toString()
    }

    class Novela {
        - String genero
        + Novela()
        + Novela(String, String, int, int, String)
        + String getGenero()
        + void setGenero(String)
        + String toString()
    }

    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUniajc
    Libro <|-- Novela