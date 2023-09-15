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
    private int avanz;
    private boolean vive=true;
    private boolean avanzar=true;

    public ProgressBars() {
    }

    public ProgressBars(int seg) {
        this.seg = seg;
    }

    public ProgressBars(int seg, int avanz) {
        this.seg = seg;
        this.avanz = avanz;
    }
    
    

    @Override
    public void run() {
        while(vive){
            if(avanzar){
                avan.setValue(avan.getValue()+1);
                if(avan.getValue()==avanz){
                    vive=false;
                }                
            } 
            
            try {
                Thread.sleep(seg);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
