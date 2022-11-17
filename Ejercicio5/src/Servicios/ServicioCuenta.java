/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCuenta {

    Cuenta C1 = new Cuenta();

    public void IngresarCuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su número de DNI sin puntos ni espacios");
        C1.setDNI(leer.nextInt());
        System.out.println("Ingrese su saldo actual $");
        C1.setSaldoActual(leer.nextInt());
        System.out.println("Ingrese su número de cuenta");
        C1.setNumeroCuenta(leer.nextInt());
    }

    public void IngresrDinero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma;
        System.out.println("¿Cuánto dinero desea ingresar?");
        suma = leer.nextInt();
        C1.setSaldoActual(C1.getSaldoActual() + suma);
    }

    public void ExtraerDinero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double resta;
        System.out.println("¿Cuánto dinero desea extraer?");
        resta = leer.nextDouble();
        if (resta > C1.getSaldoActual()) {
            System.out.println("No posee suficiente dinero.");
            C1.setSaldoActual(0);
        } else {

            System.out.println("Extracción exitosa!");
            resta = C1.getSaldoActual() - resta;
            C1.setSaldoActual((int) resta);
        }
    }

    public void ExtraerRapido() {
        double extraccion;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cuánto dinero desea extraer de manera rápida?");
        extraccion = leer.nextDouble();
        if (extraccion > (C1.getSaldoActual() * 0.20)) {
            System.out.println("El valor que desea extraer es mayor al 20% de su saldo");
            System.out.println("");

        } else {
            System.out.println("Extracción exitosa!");
            C1.setSaldoActual((int) (C1.getSaldoActual() - extraccion));
            System.out.println("");
        }

    }

    public void ConsultarSaldo() {
        System.out.println("Su saldo actual es de " + C1.getSaldoActual());
        System.out.println("");
    }

    public void ConsultarDatos() {
        System.out.println("Su DNI es " + C1.getDNI() + "\n"
                + "Su número de cuenta es " + C1.getNumeroCuenta() + "\n"
                + "Su saldo actual es " +C1.getSaldoActual());
    }
}
