/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package ejercicioextrapoo1;

import Servicio.ServicioFraccion;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioFraccion s1 = new ServicioFraccion();
        int opcion;
        System.out.println("Bienvenido!");
        s1.llenarFraccion();
       // s1.maximoComunDivisor();
        do {
            System.out.println("Ingrese una opción: \n"
                    + "1. Sumar \n"
                    + "2. Restar \n"
                    + "3. Multiplicar \n"
                    + "4. Dividir \n"
                    + "5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    s1.sumar();
                    break;
                case 2:
                    s1.restar();
                    break;
                case 3:
                    s1.multiplicar();
                    break;
                case 4:
                    s1.dividir();
                    break;
                default:
                    System.out.println("La opción elegida es incorreccta.");
            }
            System.out.println("----------");
        } while (opcion != 5);
        System.out.println("------------------");
        System.out.println("Hasta luego!");
    }

}
