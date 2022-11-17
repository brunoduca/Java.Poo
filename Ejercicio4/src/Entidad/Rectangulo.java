/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

/**
 *
 * @author usuario
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void CalcularSuperficie(int base, int altura) {
        System.out.println("La superficie del rectángulo es " + (base * altura));
    }

    public void CalcularPerimetro(int base, int altura) {
        System.out.println("El perímetro del rectángulo es " + ((base + altura) * 2));
    }

    public void Imprimir(int base, int altura) {
        String caracter;
        caracter = "* ";

        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == 1) || (i == base) || (j == 1) || (j == altura)) {
                    System.out.print(caracter);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
}
