/*
Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package Servicio;

import Entidad.pass;
import java.util.*;

/**
 *
 * @author usuario
 */
public class ServicioPass {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    pass p1 = new pass();

    public boolean crearPass() {
        boolean flag;
        int longitud;
        String contrasenia;
        System.out.println("Ingrese la contraseña");
        contrasenia = leer.next();
        longitud = contrasenia.length();
        flag = longitud == 10;
        if (flag) {
            p1.setPass(contrasenia);
        }
        return flag;
    }

    public void anlizarPass() {
        int cont, cont1;
        cont = 0;
        cont1 = 0;
        for (int i = 0; i < 10; i++) {
            if (p1.getPass().substring(i, i + 1).equalsIgnoreCase("a")) {
                cont++;
            }
            if (p1.getPass().substring(i, i + 1).equalsIgnoreCase("z")) {
                cont1++;
            }
        }
        if ((cont >= 2) && (cont1 > 0)) {
            System.out.println("Su contraseña es de ALTA seguridad");
        } else if (cont1 > 0) {
            System.out.println("Su contraseña es de seguridad MEDIA");
        } else {
            System.out.println("Su contraseña es de BAJA seguridad");
        }
    }

    public void ingresarDNI() {
        System.out.println("Ingrese el número de DNI sin espacios ni puntos");
        p1.setDni(leer.nextInt());
    }

    public void ingresarNombre() {
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
    }
}
