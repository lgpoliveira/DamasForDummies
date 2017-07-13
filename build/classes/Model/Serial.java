package Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author guga
 */
public class Serial {

    public native int openPort(); // Abre a conexão com a porta serial.
    public native void write(byte[] msg); // Envia a mensagem via serial.
    public native byte[] read(); // Recebe a mensagem via serial.
    public native void closePort(); // Fecha a conexão com a porta serial.
    


    static {
        System.loadLibrary("Serial");
    }
	public Serial(){

	}

        public int abrePorta()
	{
		return openPort();
	}
	public byte[] ler()
	{
                
    		return read();
	}
	public void escreve(byte[] msg)
	{
		write(msg);
	}
	public void fechaPorta()
	{
		closePort();
	}
}
