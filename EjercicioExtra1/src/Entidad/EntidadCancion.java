/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package Entidad;

/**
 *
 * @author usuario
 */
public class EntidadCancion {
    private String titulo;
    private String auror;

    public EntidadCancion() {
        
    }

    public EntidadCancion(String titulo, String auror) {
        this.titulo = titulo;
        this.auror = auror;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuror() {
        return auror;
    }

    public void setAuror(String auror) {
        this.auror = auror;
    }
    
    
    
}
