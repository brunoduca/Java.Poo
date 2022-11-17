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
package Entidad;

/**
 *
 * @author usuario
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    

    public void CrearCircunferencia(double radio) {
        this.radio = radio;
    }

    public void area(double radio) {
        double area = Math.PI + Math.pow(radio, 2);
        System.out.println("El área de la circunferencia es: " + area);
    }

    public void perimetro(double radio) {
        double perimetro = ( 2* Math.PI * radio);
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
    }

}
