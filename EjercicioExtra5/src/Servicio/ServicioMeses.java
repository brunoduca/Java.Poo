/*
 Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicio;

import Entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioMeses {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Mes m1 = new Mes();

    public int cearMesSecreto() {
        int n = (int) (Math.random() * 10 + 3);
        return n;
    }
    public void comprobar(int n) {
        String intento;
        do {    
            System.out.println("Adivine el mes secreto");
            intento = leer.next().toLowerCase();
            if (intento.equals(m1.getMesSecreto()[n])) {
                System.out.println("Ha acertado!");
            } else {
                System.out.println("Error. Intente introducir otro mes");
            }
        } while (!intento.equals(m1.getMesSecreto()[n]));
    }

}
