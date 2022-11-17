/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Servicio;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioPuntos {

    Puntos p1 = new Puntos();
    Scanner leer = new Scanner(System.in);

    public void crearPuntos() {
        System.out.println("Ingrese el primer número de la primera coordenada");
        p1.setX1(leer.nextInt());
        System.out.println("Ingrese el segundo número de la primera coordenada");
        p1.setY1(leer.nextInt());
        System.out.println("---------------------------");
        System.out.println("Ingrese el segundo número de la segunda coordenada");
        p1.setX2(leer.nextInt());
        System.out.println("Ingrese el segundo número de la segunda coordenada");
        p1.setY2(leer.nextInt());
        System.out.println(" ");
        System.out.println("Primera coordenada = (" + p1.getX1() + "," + p1.getY1() + ")");
        System.out.println("Segunda coordenada = (" + p1.getX2() + "," + p1.getY2() + ")");
    }
    
    public void devolverDistancia(){
        System.out.println("La distancia entre ambos puntos es de: ");
        System.out.println(Math.sqrt(Math.pow(p1.getX2() - p1.getX1(), 2) + Math.pow(p1.getY2() - p1.getY1(), 2)));
    }
}
