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
package Servicio;

/**
 *
 * @author usuario
 */
import Entidad.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Cadena c1 = new Cadena();
    Cadena c2 = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void pedirFrase() {
        System.out.println("Ingrese una fras");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());

    }

    public int mostrarVocales() {
        int vocales = 0;
        if ((c1.getFrase().equalsIgnoreCase("a")) || (c1.getFrase().equalsIgnoreCase("e")) || (c1.getFrase().equalsIgnoreCase("i")) || (c1.getFrase().equalsIgnoreCase("o")) || (c1.getFrase().equalsIgnoreCase("u"))) {
            vocales++;
        }
        return vocales;
    }

    public void invertirFrase() {
        String letra;
        for (int i = c1.getLongitud(); i == 0; i--) {
            letra = c1.getFrase().substring(i - 1, i);
            System.out.print(letra);
        }
        System.out.println("");
    }

    public int vecesRepetido() {
        String letraRepetida;
        System.out.println("Ingrese la letra que quiere contar");
        letraRepetida = leer.next();
        int contador;
        contador = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            letraRepetida = c1.getFrase().substring(0);
            if (letraRepetida.equals(c1.getFrase().substring(i)) && (i > 0)) {
                contador++;
            }
        }
        return contador;
    }

    public String compararLongiud() {
        String comparar;
        System.out.println("Ingrese una nueva frase");
        c2.setFrase(leer.next());
        c2.setLongitud(c2.getFrase().length());
        if (c1.getLongitud() == c2.getLongitud()) {
            comparar = "Las frases miden lo mismo";

        } else if (c1.getLongitud() > c2.getLongitud()) {
            comparar = "La primera frase es mayor a la segunda";

        } else {
            comparar = "La segunda frase es mayor a la primera";
        }
        return comparar;
    }

    public String unirFrases() {
        String unirFrases;
        unirFrases = (c1.getFrase() + c2.getFrase());
        return unirFrases;
    }

    public void reemplazar() {
        System.out.println("Ingrese un caracter");
        String letra = leer.next();
        String frase2;
        String FRASE = c1.getFrase().toLowerCase();
        frase2 = FRASE.replace("a", letra);
        System.out.println("La frasa modificada es;" + frase2);
    }

    public void contiene() {
        String letra1;
        System.out.println("Ingrese una letra");
        letra1 = leer.next();
        boolean contiene = c1.getFrase().contains(letra1);

    }

}
