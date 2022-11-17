/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Main;

import Entidades.Matematica;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica n1 = new Matematica();
        Matematica n2 = new Matematica();
        n1.setN1(Math.random() * 10 + 1);
        System.out.println("El primer número es: " + n1.getN1());
        n2.setN2(Math.random() * 10 + 1);
        System.out.println("El segundo número es: " + n2.getN2());
        DevolverMayor(n1, n2);
        CalcularPotenica(n1, n2, DevolverMayor(n1, n2));
        CalcularRaiz(n1, n2, DevolverMayor(n1, n2));
    }

    public static double DevolverMayor(Matematica n1, Matematica n2) {
        double mayor;
        if (n1.getN1() > n2.getN2()) {
            mayor = n1.getN1();
            System.out.println("El primer valor es mayor");
        } else {
            mayor = n2.getN2();
            System.out.println("El segundo valor es mayor");
        }
        return mayor;
    }

    public static void CalcularPotenica(Matematica n1, Matematica n2, double mayor) {
        mayor = Math.abs(mayor);
        int potencia;
        if (mayor == n1.getN1()) {
            potencia = (int) (Math.pow(mayor, n2.getN2()));
            System.out.println("La potencia de " + mayor + " al " + n2.getN2() + " es: " + potencia);
        } else {
            potencia = (int) (Math.pow(mayor, n1.getN1()));
            System.out.println("La potencia de " + mayor + " al " + n1.getN1() + " es: " + potencia);
        }
    }

            
    public static void CalcularRaiz(Matematica n1, Matematica n2, double mayor) {
        mayor = Math.abs(mayor);
        int raiz;
        if (mayor == n1.getN1()) {
            raiz = (int) Math.sqrt(n2.getN2());
            System.out.println("La raíz cuadrada de " + n2.getN2() + " es: " + raiz);
        } else {
            raiz = (int) Math.sqrt(n1.getN1());
            System.out.println("La raíz cuadrada de " + n1.getN1() + " es: " + raiz);
        

    }

}
}