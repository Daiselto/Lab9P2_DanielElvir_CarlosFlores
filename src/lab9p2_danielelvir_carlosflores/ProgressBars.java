/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_danielelvir_carlosflores;

import javax.swing.JProgressBar;

public class ProgressBars implements Runnable {

    private JProgressBar avan;
    private int seg;
    private int avanz;
    private boolean vive = true;
    private boolean avanzar = true;

    public ProgressBars(int seg, int avanz, JProgressBar avan) {
        this.seg = seg;
        this.avanz = avanz;
        this.avan = avan;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {                
                avan.setValue(avan.getValue() + 1);
                if (avan.getValue() == avanz) {
                    vive = false;
                    System.out.println("Progress Bar llena");
                    avan.setValue(0);                    
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
