/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    private Date fecha;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio, Date fecha) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.fecha = fecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
       this.fecha = new Date(anio - 1900, mes - 1, dia);
    }

}
