/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package Servicio;

import Entidades.Fraccion;
import java.util.*;

/**
 *
 * @author usuario
 */
public class ServicioFraccion {

    Scanner leer = new Scanner(System.in);
    Fraccion f1 = new Fraccion();

    public void llenarFraccion() {
        System.out.println("Ingrese el númerador de la primera fracción");
        f1.setNumerador1(leer.nextInt());
        do {
            System.out.println("Ingrese el denominador de la primera fracción diferente a 0");
            f1.setDenominador1(leer.nextInt());
        } while (f1.getDenominador1() == 0);
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Ingrese el númerador de la segunda fracción");
        f1.setNumerador2(leer.nextInt());
        do {
            System.out.println("Ingrese el denominador de la segunda fracción diferente a 0");
            f1.setDenominador2(leer.nextInt());
        } while (f1.getDenominador2() == 0);
    }

    public void sumar() {
        System.out.println("El resultado de la suma es:");
        System.out.println((f1.getNumerador1() * f1.getDenominador2() + f1.getNumerador2() * f1.getDenominador1() +  "/"+ (f1.getDenominador1() * f1.getDenominador2())));
        System.out.println("");
    }

    public void restar() {
        System.out.println("El resultado de la resta es:");
        System.out.println((f1.getNumerador1() * f1.getDenominador2() - f1.getNumerador2() * f1.getDenominador1()) + "/" + (f1.getDenominador1() * f1.getDenominador2()));
        System.out.println("");
    }

    public void multiplicar() {
        System.out.println("El resultado de la multiplicación es:");
        System.out.println((f1.getNumerador1() * f1.getNumerador2()) + "/" + (f1.getDenominador1() * f1.getDenominador2()));
        System.out.println("");
    }
 
   public void dividir() {
        System.out.println("El resultado de la división es:");
        System.out.println((f1.getNumerador1() * f1.getDenominador2()) + "/" + (f1.getNumerador2() * f1.getDenominador1()));
        System.out.println("");
   
 }
}
