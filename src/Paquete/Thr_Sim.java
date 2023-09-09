/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author Junnior Sauceda
 */
public class Thr_Sim extends Thread{
    private JProgressBar piscina=new JProgressBar();
    private boolean vive=true;

    public Thr_Sim() {
        super();
    }

    public Thr_Sim(JProgressBar b) {
        piscina=b;
    }

    public JProgressBar getPiscina() {
        return piscina;
    }

    public void setPiscina(JProgressBar piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Thr_Sim{" + "piscina=" + piscina + '}';
    }
    
    @Override
    public void run(){
        while(vive){
            Random ran=new Random();
            piscina.setValue(piscina.getValue()+(ran.nextInt(5)));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    
    
    
}
