/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo R1 = new Rectangulo();
        System.out.println("Ingrese la altura del rectángulo");
        R1.setAltura(leer.nextInt());
        System.out.println("Ingrese la base del rectángulo");
        R1.setBase(leer.nextInt());
       
        R1.CalcularSuperficie(R1.getAltura(),R1.getBase());
        R1.CalcularPerimetro(R1.getAltura(),R1.getBase());
        System.out.println("");
        R1.Imprimir(R1.getAltura(), R1.getBase());

    }

}
