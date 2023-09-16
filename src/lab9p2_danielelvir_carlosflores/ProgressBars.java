package lab9p2_danielelvir_carlosflores;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class ProgressBars implements Runnable {

    private JProgressBar avan;
    private int seg;
    private int avanz;
    private boolean vive = true;
    private boolean avanzar = true;
    private Color color;
    private String datos;
    private JTextArea tA;

    public ProgressBars(int seg, int avanz, JProgressBar avan, String datos, JTextArea tA, Color color) {
        this.seg = seg;
        this.avanz = avanz;
        this.avan = avan;
        this.color = color;
        this.datos = datos;
        this.tA = tA;

    }
    public ProgressBars(int seg, int avanz, JProgressBar avan, Color color) {
        this.seg = seg;
        this.avanz = avanz;
        this.avan = avan;
        this.color = color;
        

    }

    public JProgressBar getAvan() {
        return avan;
    }

    public void setAvan(JProgressBar avan) {
        this.avan = avan;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getAvanz() {
        return avanz;
    }

    public void setAvanz(int avanz) {
        this.avanz = avanz;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public JTextArea gettA() {
        return tA;
    }

    public void settA(JTextArea tA) {
        this.tA = tA;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                avan.setValue(avan.getValue() + 1);
                avan.setForeground(color);
                if (avan.getValue() == avanz) {
                    vive = false;
                    //System.out.println("Progress Bar llena");
                    avan.setValue(0);
                    tA.setText(datos);
                }
            }

            try {
                Thread.sleep(seg);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
