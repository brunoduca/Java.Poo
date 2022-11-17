/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene /*
 */
package ejercicio8;

/**
 *
 * @author usuario
 */
import Servicio.ServicioCadena;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCadena S1 = new ServicioCadena();
        S1.pedirFrase();
        System.out.println("La frase tiene " + S1.mostrarVocales() + " vocales");
        S1.invertirFrase();
        System.out.println("El caracter ingresado se reptite " + S1.vecesRepetido () + " veces");
        S1.compararLongiud();
        System.out.println("La nueva frase es: " + S1.unirFrases());
        S1.reemplazar();

    }

}
