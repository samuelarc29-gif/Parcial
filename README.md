SAMUEL ANDRES RENGIFO CORTES

classDiagram
    class Libro {
        -String titulo
        -String autor
        -int numeroEjemplares
        -int numeroEjemplaresPrestados
        +Libro()
        +Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados)
        +getTitulo() String
        +setTitulo(String titulo) void
        +getAutor() String
        +setAutor(String autor) void
        +getNumeroEjemplares() int
        +setNumeroEjemplares(int numeroEjemplares) void
        +getNumeroEjemplaresPrestados() int
        +setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) void
        +prestamo() boolean
        +devolucion() boolean
        +toString() String
    }

    class LibroTexto {
        -String curso
        +LibroTexto()
        +LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso)
        +getCurso() String
        +setCurso(String curso) void
        +toString() String
    }

    class LibroTextoUNIAC {
        -String facultad
        +LibroTextoUNIAC()
        +LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso, String facultad)
        +getFacultad() String
        +setFacultad(String facultad) void
        +toString() String
    }

    class Novela {
        -String tipo
        +Novela()
        +Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String tipo)
        +getTipo() String
        +setTipo(String tipo) void
        +toString() String
    }

    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUNIAC
    Libro <|-- Novela

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
}