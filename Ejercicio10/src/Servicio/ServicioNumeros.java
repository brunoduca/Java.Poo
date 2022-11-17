/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
or (int i = 0; i < n1.getArreglo1().length; i++) {
   }
 */
package Servicio;

import Entidades.Numeros;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class ServicioNumeros {

    Numeros n1 = new Numeros();

    public void LlenarArreglos() {
        double [] n2  = new double [50];
        double [] n3 = new double[20];
        for (int i = 0; i < n1.getArreglo1().length; i++) {
            n2[i] = Math.random() * 10 +1;
            n1.setArreglo1(n2);
        }
        n1.setArreglo2(Arrays.copyOf(n1.getArreglo1(), 10));
        Arrays.fill(n1.getArreglo2(), 10, 20 , 0.5);
        for (int i = 0; i < n1.getArreglo2().length; i++) {
            System.out.println(n1.getArreglo2()[i]);
        }
    }

    public void MayorMenor() {
        Arrays.sort(n1.getArreglo1());
    }

    public void Mostrar() {
        for (int i = 0; i < n1.getArreglo1().length; i++) {
            System.out.println( (i+1) + ") " + n1.getArreglo1()[i]);
        }
        System.out.println(" ");
        System.out.println(" ---------------------- ");
        System.out.println(" ");
        for (int i = 0; i < n1.getArreglo2().length; i++) {
            System.out.println((i+1) + ") " + n1.getArreglo2()[i]);

        }
    }
}
