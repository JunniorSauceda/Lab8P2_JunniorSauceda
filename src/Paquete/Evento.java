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
public class Evento implements Serializable{
    private String Estilo;
    private int distancia;
    private double record;

    public Evento() {
    }

    public Evento(String Estilo, int distancia, double record) {
        this.Estilo = Estilo;
        this.distancia = distancia;
        this.record = record;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return Estilo + "|" + distancia + "m, Record:" + record + "s";
    }
    
}
