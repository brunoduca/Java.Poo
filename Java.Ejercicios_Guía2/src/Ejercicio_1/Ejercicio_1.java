/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
ISBN = El ISBN ​ es un identificador único para libros.​ Mediante este sistema, a cada libro 
se le asigna una cadena alfanumérica única internacional que sirve para identificar datos básicos 
del objeto tales como título, editorial, tirada, extensión, materia, país, traductor, lengua original, etc.
 */
package Ejercicio_1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro L1 = new Libro();
        System.out.println("Ingrese el código ISB");
        String ISB = leer.next();
        System.out.println("Ingrese el título");
        String titulo = leer.next();
        System.out.println("Ingrese el autor");
        String autor = leer.next();
        System.out.println("Ingrese el número de páginas");
        int paginas = leer.nextInt();

        L1.llenarLibro(ISB, titulo, autor, paginas);

        L1.MostrarLibro();
    }
}
