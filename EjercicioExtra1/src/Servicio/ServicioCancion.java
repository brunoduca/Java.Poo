/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.EntidadCancion;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCancion {

    EntidadCancion c1 = new EntidadCancion();
    Scanner leer = new Scanner(System.in);

    public void LlenarInfo() {
        System.out.println("Ingrese el título de la canción");
        c1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        c1.setAuror(leer.next());

        System.out.println("El título y autor de la canción es: ");
        System.out.println(c1.getTitulo() + " del compositor: " + c1.getAuror());
    }
}
