/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author usuario
 */
public class Libro {

    public String ISB;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }
    

    public Libro(String ISB, String titulo, String autor, int paginas) {
        this.ISB = ISB;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void llenarLibro(String ISB, String titulo, String autor, int paginas) {
        this.ISB = ISB;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void MostrarLibro() {
        System.out.println("El código del libro es " + ISB);
        System.out.println(" el autor es " + autor);
        System.out.println(" la cantidad de páginas es " + paginas);
    }

}
