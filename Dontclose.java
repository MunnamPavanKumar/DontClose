/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontclose;

import java.awt.AWTEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 00511175
 */
public class Dontclose extends TimerTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        // TODO code application logic here

        Timer timer = new Timer();
        timer.schedule(new Dontclose(), 0, 100000);
        timer.schedule(new Dontclose(), 0, 100500);

    }

    @Override
    public void run() {

        try {
            Robot dc = new Robot();
            dc.keyPress(KeyEvent.VK_WINDOWS);
            dc.keyRelease(KeyEvent.VK_WINDOWS);
          
        } catch (AWTException ex) {
            Logger.getLogger(Dontclose.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
