/*
  Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la capacidad máxima de la cafetera");
        setCapacidadMaxima(leer.nextInt());
        setCantidadActual(getCapacidadMaxima());
        System.out.println("La capacidad máxima es: " + getCapacidadMaxima());
    }

    public int servirTaza() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int taza;
        System.out.println("Ingrese el tamaño de la taza vacía");
        taza = leer.nextInt();
        if (taza <= (getCantidadActual())) {
            taza = getCantidadActual();
            setCantidadActual(getCantidadActual() - taza);
        } else if (getCantidadActual() > 0) {
            taza = getCantidadActual();
            setCantidadActual(0);
        } else {
            System.out.println("No hay café disponible");
        }
        System.out.println("La cantidad actual de café es:" + getCantidadActual());
        System.out.println("La taza tinene " + taza + " de café");
        return taza;
    }

    public void VaciarCafetera() {
        setCantidadActual(0);
        System.out.println("La cantidad de café actual es: " + getCantidadActual());
    }

    public int agregarCafe() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int agregado;
        System.out.println("Ingrese la cantidad de café que desea agregar");
        agregado = leer.nextInt();
        if (agregado < getCapacidadMaxima()) {
            setCantidadActual(agregado);
        }
        System.out.println("La cantidad de café acutal es: " + getCantidadActual());
        return agregado;
    }

}
