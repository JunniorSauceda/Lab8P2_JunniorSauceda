/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import java.io.Serializable;

/**
 *
 * @author Junnior Sauceda
 */
public class Nadador implements Serializable{
   private String nombre;
   private Pais nacionalidad;
   private int edad, distancia,medallas;
   private double estatura,tiempo;
   private String estilo;

    public Nadador() {
    }

    public Nadador(String nombre, Pais nacionalidad, int edad, int distancia, int medallas, double estatura, double tiempo, String estilo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.distancia = distancia;
        this.medallas = medallas;
        this.estatura = estatura;
        this.tiempo = tiempo;
        this.estilo = estilo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return nombre + ", " + distancia + 'm';
    }
   
}
