/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 */
package ejercicio2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        Circunferencia C1 = new Circunferencia();
        
        System.out.println("Ingrese el radio");
        C1.CrearCircunferencia(leer.nextDouble());
        
        System.out.println("Ingrese un nuevo radio");
        C1.setRadio(leer.nextDouble());
        
        System.out.println("Ahora el radio es: "+ C1.getRadio());
        
        C1.area(C1.getRadio());
        
        C1.perimetro(C1.getRadio());
        
        
    }
    
}
