package ejercicio_7;

import ejercicio_7.Servicios.Service;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Service persona1 = new Service();
        Service persona2 = new Service();
        Service persona3 = new Service();
        Service persona4 = new Service();
        int[] ICM = new int[4];
        boolean[] flags = new boolean[4];
        int cont = 0,contN = 0,cont0 = 0,cont1 = 0;
        
        
        System.out.println("Ingresando la persona #1");
        persona1.crearPersona();
        flags[0] = persona1.esMayorDeEdad();
        ICM[0] = persona1.calcularIMC();
        if (persona1.calcularIMC() == -1) {
            System.out.println("Esta persona esta por debajo de su peso ideal");
        }else if(persona1.calcularIMC() == 0){
            System.out.println("Esta persona esta en su peso ideal");
        }else{
            System.out.println("Esta persona tiene sobrepeso");
        }
        
        if (persona1.esMayorDeEdad() == true) {
            System.out.println("Esta persona es mayor de edad");
        }else{
            System.out.println("Esta persona es menor de edad");
        }
        
        System.out.println("------------------------");
        System.out.println("Ingresando la persona #2");
        persona2.crearPersona();
        flags[1] = persona2.esMayorDeEdad();
        ICM[1] = persona2.calcularIMC();
        if (persona2.calcularIMC() == -1) {
            System.out.println("Esta persona esta por debajo de su peso ideal");
        }else if(persona2.calcularIMC() == 0){
            System.out.println("Esta persona esta en su peso ideal");
        }else{
            System.out.println("Esta persona tiene sobrepeso");
        }
        
        if (persona2.esMayorDeEdad() == true) {
            System.out.println("Esta persona es mayor de edad");
        }else{
            System.out.println("Esta persona es menor de edad");
        }
        
        System.out.println("------------------------");
        System.out.println("Ingresando la persona #3");
        persona3.crearPersona();
        flags[2] = persona3.esMayorDeEdad();
        ICM[2] = persona3.calcularIMC();
        if (persona3.calcularIMC() == -1) {
            System.out.println("Esta persona esta por debajo de su peso ideal");
        }else if(persona3.calcularIMC() == 0){
            System.out.println("Esta persona esta en su peso ideal");
        }else{
            System.out.println("Esta persona tiene sobrepeso");
        }
        
        if (persona3.esMayorDeEdad() == true) {
            System.out.println("Esta persona es mayor de edad");
        }else{
            System.out.println("Esta persona es menor de edad");
        }
        
        
        System.out.println("------------------------");
        System.out.println("Ingresando la persona #4");
        persona4.crearPersona();
        flags[3] = persona4.esMayorDeEdad();
        ICM[3] = persona4.calcularIMC();
        if (persona4.calcularIMC() == -1) {
            System.out.println("Esta persona esta por debajo de su peso ideal");
        }else if(persona4.calcularIMC() == 0){
            System.out.println("Esta persona esta en su peso ideal");
        }else{
            System.out.println("Esta persona tiene sobrepeso");
        }
        
        if (persona4.esMayorDeEdad() == true) {
            System.out.println("Esta persona es mayor de edad");
        }else{
            System.out.println("Esta persona es menor de edad");
        }
        
        for (int i = 0; i < 4; i++) {
                switch(ICM[i]){
                    case -1:
                        contN++;
                        break;
                    case 0:
                        cont0++;
                        break;
                    case 1:
                        cont1++;
                        break;
                }
        }
        
        for (int i = 0; i < 4; i++) {
            if (flags[i] == true) {
                cont++;                
            }
        }
        
        System.out.println("El " + ((cont*100)/4) + "% son mayores de edad");
        System.out.println("El " + ((contN*100)/4) + "% Estan por debajo de el peso ideal");
        System.out.println("El " + ((cont0*100)/4) + "% Estan en su peso ideal");
        System.out.println("El " + ((cont1*100)/4) + "% Estan por encima de el peso ideal");
        
    }
    
}
