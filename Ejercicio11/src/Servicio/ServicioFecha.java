/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Fecha;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioFecha {

    Fecha F1 = new Fecha();
    Date fecha1 = new Date();
    Scanner leer = new Scanner(System.in);

    public void LlenarFecha() {
        System.out.println("Ingrese el día");
        F1.setDia(leer.nextInt());
        System.out.println("Ingrese un mes");
        F1.setMes(leer.nextInt());
        System.out.println("Ingrese el año");
        F1.setAnio(leer.nextInt());
        Date fecha = new Date(F1.getAnio(), F1.getMes(), F1.getDia());
        F1.setFecha(fecha);
    }
    public void MostrarFecha(){
        System.out.println(F1.getFecha());
    }

    public void CompararFechas() {
        System.out.println("La diferenica entre el año ingresado y la actual es: ");
        System.out.println(fecha1.getYear() - F1.getFecha().getYear());
    }

}
