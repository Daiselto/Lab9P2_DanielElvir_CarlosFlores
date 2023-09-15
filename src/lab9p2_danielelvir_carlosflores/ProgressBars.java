/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_danielelvir_carlosflores;

import javax.swing.JProgressBar;

/**
 *
 * @author HP
 */
public class ProgressBars implements Runnable{
    private JProgressBar avan = new JProgressBar();
    private int seg;
    private boolean vive=true;
    private boolean avanzar=true;

    public ProgressBars() {
    }

    public ProgressBars(int seg) {
        this.seg = seg;
    }

    @Override
    public void run() {
        /*while(vive){
            if(avanzar){
                avan.setValue(avan.getValue()+1);
                if(avan.getValue()==avan){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }*/
    }
    
    
}
