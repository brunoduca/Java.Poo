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
public class Operacion {

    private int n1;
    private int n2;

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operacion() {
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void CrearOperacion(int n1, int n2) {

    }

    public void Suma(int n1, int n2) {
        System.out.println("La suma es = " + (n1 + n2));

    }

    public void Resta(int n1, int n2) {
        System.out.println("La resta es = " + (n1 - n2));
    }

    public void Multiplicacion(int n1, int n2) {
        int multiplicacion;
        multiplicacion = n1 * n2;
        if (multiplicacion == 0) {
            System.out.println("El resultado de la multiplicación es 0. Error");
        } else {
            System.out.println("La multiplicación es = " + (n1 * n2));
        }
    }

    public void Dividir(int n1, int n2) {
        int division;
        division = n1 / n2;
        if (division == 0) {
            System.out.println("El resultado de la división es 0. Error");
        } else {
            System.out.println("La división es = " + (n1 / n2));
        }
    }
}
