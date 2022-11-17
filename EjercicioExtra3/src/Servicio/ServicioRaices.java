/*
 Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package Servicio;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioRaices {

    Raices r1 = new Raices();
    Scanner leer = new Scanner(System.in);

    public void llenarVariables() {
        System.out.println("Ingrese el valor de la variable A");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese el valor de la variable B");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese el valor de la variable C");
        r1.setC(leer.nextInt());
    }

    public double getDiscriminante() {
        double discriminante;
        discriminante = (Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()));
        return discriminante;
    }

    public boolean tieneRaices(double discriminante) {
        boolean tieneRaices;
        tieneRaices = (discriminante > 0);
        return tieneRaices;
    }

    public boolean tieneRaiz(double discriminante) {
        boolean tieneRaiz;
        tieneRaiz = (discriminante == 0);
        return tieneRaiz;
    }

    public void obtenerRaices(boolean tieneRaices) {
        if (tieneRaices) {

            System.out.println("(" + r1.getB() + " + √((" + r1.getB() + "^2)-(4*" + r1.getA() + "*" + r1.getC() + ")))/(2*" + r1.getA() + ") =");
            System.out.println((-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA()));
            System.out.println("(" + r1.getB() + " - √((" + r1.getB() + "^2)-(4*" + r1.getA() + "*" + r1.getC() + ")))/(2*" + r1.getA() + ") =");
            System.out.println((-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA()));

        }
    }

    public void obtenerRaiz(boolean tieneRaiz) {
        if (tieneRaiz) {
            System.out.println("(" + r1.getB() + "± √((" + r1.getB() + "^2)-(4*" + r1.getA() + "*" + r1.getC() + ")))/(2*" + r1.getA() + ") =");
            System.out.println((-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA()));
            System.out.println("-" + (-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA()));

        }
    }

    public void calcular(boolean tieneRaices, boolean tieneRaiz) {
        if (tieneRaices) {
            System.out.println("Las raíces son:");
            obtenerRaices(tieneRaices);
        } else if (tieneRaiz) {
            System.out.println("La raíz es");
            obtenerRaiz(tieneRaiz);
        } else {
            System.out.println("Los valores ingresados no correspoden a ninguna raíz.");
        }
    }

}
