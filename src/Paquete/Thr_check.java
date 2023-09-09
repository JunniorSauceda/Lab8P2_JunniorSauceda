/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Junnior Sauceda
 */
public class Thr_check extends Thread {

    private JProgressBar PB1 = new JProgressBar();
    private JProgressBar PB2 = new JProgressBar();
    private JProgressBar PB3 = new JProgressBar();
    private boolean vive = true;
    private boolean termino = false;
    private Thread p1;
    private Thread p2;
    private Thread p3;
    private Evento EV;
    private Nadador N1;
    private Nadador N2;
    private Nadador N3;
    public Thr_check() {
        super();
    }

    public Thr_check(JProgressBar p1, JProgressBar p2, JProgressBar p3,Thread P1,Thread P2,Thread P3,Evento E,Nadador na1,Nadador na2,Nadador na3) {
        PB1 = p1;
        PB2 = p2;
        PB3 = p3;
        this.p1=P1;
        this.p2=P2;
        this.p3=P3;
        EV=E;
        N1=na1;
        N2=na2;
        N3=na3;
    }

    public JProgressBar getPB1() {
        return PB1;
    }

    public void setPB1(JProgressBar PB1) {
        this.PB1 = PB1;
    }

    public JProgressBar getPB2() {
        return PB2;
    }

    public void setPB2(JProgressBar PB2) {
        this.PB2 = PB2;
    }

    public JProgressBar getPB3() {
        return PB3;
    }

    public void setPB3(JProgressBar PB3) {
        this.PB3 = PB3;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isTermino() {
        return termino;
    }

    public void setTermino(boolean termino) {
        this.termino = termino;
    }

    @Override
    public void run() {
        while (vive) {
            
            if (PB1.getValue() == 100||PB2.getValue() == 100||PB3.getValue() == 100) {
                termino=true;
                p1.stop();
                p2.stop();
                p3.stop();
                Nadador ganador=new Nadador();
                String Detalles="Evento\n"+"Estilo: "+EV.getEstilo()+"\nDistancia: "+EV.getDistancia()+
                        "Mejor tiempo:"+EV.getRecord()+"\nGanador\n";
                if(PB1.getValue()>=100){
                    ganador=N1;
                    
                }
                if(PB2.getValue()>=100){
                    ganador=N2;
                }
                if(PB3.getValue()>=100){
                    ganador=N3;
                    
                }
                Detalles+=ganador.getNombre()+"\nEdad: "+ganador.getEdad()+"\nEstatura"+ganador.getEstatura()+
                        "\nEstilo:"+ganador.getEstilo()+"\nDistancia"+ganador.getDistancia()+"\nTiempo"+ganador.getTiempo()
                        +"\nMedallas: "+ganador.getMedallas();
                JOptionPane.showMessageDialog(null, "Tenemos 1 Ganador\n\n"+Detalles);
                vive=false;
            }
            try {

                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}
