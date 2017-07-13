/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Controller.Jogo;
import View.Tela;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.comm.SerialPort;
import javax.comm.SerialPortEvent;
import javax.comm.SerialPortEventListener;

/**
 *
 * @author guga
 */
public class SerialEvent implements SerialPortEventListener {
    private static InputStream in = null;
    private static PrintStream out = null;
    private static SerialPort port = null;
    //private static Jogo jogo = new Jogo();
    SerialEvent(SerialPort sPort) {
        this.port = sPort;
        try {
            in = port.getInputStream();
        } catch (IOException ex) {
            Logger.getLogger(Communication.class.getName()).log(Level.SEVERE, null, ex);
        }


        
    }

    public void serialEvent(SerialPortEvent event) {
        switch(event.getEventType()) {
            case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
                outputBufferEmpty(event);
                break;

            case SerialPortEvent.DATA_AVAILABLE:
                dataAvailable(event);
                break;

    }

}

    private void outputBufferEmpty(SerialPortEvent event) {
        //char[] msg = tab.getMsg();
        //out.print(msg);
    }

    private void dataAvailable(SerialPortEvent event) {
        int c ;
        int[] msg = new int[4];
        int count = 0;
        try {
            while((c = in.read()) != -1)
            {
                msg[count] = c;
                count++;
                System.out.println(c);
                if (count == 4)
                {
                    Tela.getJogo().updateTabuleiro(msg);

                    count = 0;
                }
                
            }
            
           
        } catch (IOException ex) {
            Logger.getLogger(SerialEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
}
