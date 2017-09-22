/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelflores_examen2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Flores
 */
public class HiloCancion extends Thread {

    private JLabel tiempo;
    private Cancion e;

    public HiloCancion(JLabel tiempo, Cancion e) {
        this.tiempo = tiempo;
        this.e = e;
    }

    public HiloCancion() {
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    public Cancion getE() {
        return e;
    }

    public void setE(Cancion e) {
        this.e = e;
    }

    @Override
    public void run() {
        Principal r = new Principal();
        tiempo.setText(e.getDuracion() + "");
        while (e.getDuracion() > 0) {
            e.setDuracion(e.getDuracion() - 1);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            tiempo.setText(e.getDuracion() + "");
        }
        JOptionPane.showMessageDialog(null, "finalizo");
        r.cancion.dispose();
    }

}
