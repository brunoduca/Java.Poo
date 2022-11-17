package ejercicio7;

/**
 *
 * @author usuario
 */
import ServicioPersona.Servicio;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Debajo, Normal, Sobrepeso, Mayores, Menores;
        Debajo = 0;
        Normal = 0;
        Sobrepeso = 0;
        Mayores = 0;
        Menores = 0;
        Servicio S1 = new Servicio();
        Servicio S2 = new Servicio();
        Servicio S3 = new Servicio();
        Servicio S4 = new Servicio();

        S1.CrearPersona();
        System.out.println("Persona 1");
        switch (S1.CalcularIMC()) {
            case -1:
                System.out.println("Usted está por debajo de su peso ideal");
                Debajo++;
                break;
            case 0:
                System.out.println("Usted está en su peso ideal");
                Normal++;
                break;
            case 1:
                System.out.println("Usted tiene sobrepeso");
                Sobrepeso++;
        }
        if (S1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad!");
            Mayores++;
        } else {
            System.out.println("Es menor");
            Menores++;
        }

        System.out.println("--------------------");
        System.out.println("Persona 2");
        S2.CrearPersona();
        switch (S2.CalcularIMC()) {
            case -1:
                System.out.println("Usted está por debajo de su peso ideal");
                Debajo++;
                break;
            case 0:
                System.out.println("Usted está en su peso ideal");
                Normal++;
                break;
            case 1:
                System.out.println("Usted tiene sobrepeso");
                Sobrepeso++;
        }
        if (S2.esMayorDeEdad()) {
            System.out.println("Es mayor de edad!");
            Mayores++;
        } else {
            System.out.println("Es menor");
            Menores++;
        }
        System.out.println("--------------------");
        System.out.println("Persona 3");
        S3.CrearPersona();
        switch (S3.CalcularIMC()) {
            case -1:
                System.out.println("Usted está por debajo de su peso ideal");
                Debajo++;
                break;
            case 0:
                System.out.println("Usted está en su peso ideal");
                Normal++;
                break;
            case 1:
                System.out.println("Usted tiene sobrepeso");
                Sobrepeso++;
        }
        if (S3.esMayorDeEdad()) {
            System.out.println("Es mayor de edad!");
            Mayores++;
        } else {
            System.out.println("Es menor");
            Menores++;
        }
        System.out.println("--------------------");
        System.out.println("Persona 4");
        S4.CrearPersona();
        switch (S4.CalcularIMC()) {
            case -1:
                System.out.println("Usted está por debajo de su peso ideal");
                Debajo++;
                break;
            case 0:
                System.out.println("Usted está en su peso ideal");
                Normal++;
                break;
            case 1:
                System.out.println("Usted tiene sobrepeso");
                Sobrepeso++;
        }
        if (S4.esMayorDeEdad()) {
            System.out.println("Es mayor de edad!");
            Mayores++;
        } else {
            System.out.println("Es menor");
            Menores++;
        }

        System.out.println("El porcentaje de personas con un IMC debajo del normal es: \n"
                + ((Debajo * 100)/4) + "%");
        System.out.println("El porcentaje de personas con un IMC normal es: \n"
                + ((Normal*100)/4) + "%");
        System.out.println("El porcentaje de personas con un IMC debajo del normal es: \n"
                + ((Sobrepeso*100)/4) + "%");
        System.out.println("El porcentaje de personas que son mayores de edad es: \n"
                + ((Mayores*100)/4) + "%");
        System.out.println("El porcentaje de personas que son menores de edad es: \n"
                + ((Menores*100)/4) + "%");
    }

}
