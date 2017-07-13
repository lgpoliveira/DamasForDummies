/**
 * @author: Luis Gustavo Peil de Oliveira
 * Classe desenvolvida para iniciar a comunicação Serial.
 */
package Model;

import View.Tela;

/**
 *
 * @author guga
 */
public class Communication {

    
    private static Serial serial = new Serial();
    private static Tela tela = new Tela();
    public Communication() {

    }

    public void connectToServer() throws Exception
    {
        if(serial.abrePorta() < 0)
            System.out.println("Erro ao abrir a conexao Serial.");
    }

    public void sendMessage(byte[] msg) {
        byte[] finalMsg = new byte[4];

        finalMsg[0] = Padroes.getINICIOCOMUNICACAO();
        finalMsg[1] = msg[0];
        finalMsg[2] = msg[1];
        finalMsg[3] = Padroes.getFIMCOMUNICACAO();

        serial.write(finalMsg);
    }
    
    public void read()
    {
        byte[] array = serial.read();
        int[] msg = new int[4];
        for (int i = 0; i < 4; i++)
        {
            int t = array[i];
            if (t < 0) t= 256 + t;
            msg[i] = t;
        }
        Tela.getJogo().updateTabuleiro(msg);
    }

}
