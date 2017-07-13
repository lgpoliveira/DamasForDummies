/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imgs;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author guga
 */
public class Imagens {
    private Image pecaPreta =  new  ImageIcon(getClass().getResource("/imgs/peca_preta.jpg")).getImage();
    private Image pecaBranca = new ImageIcon(getClass().getResource("/imgs/peca_branca.jpg")).getImage();
    private Image pecaPretaSelecionada = new ImageIcon(getClass().getResource("/imgs/peca_preta_selecionada.jpg")).getImage();
    private Image pecaBrancaSelecionada = new ImageIcon(getClass().getResource("/imgs/peca_branca_selecionada.jpg")).getImage();
    private Image casaVazia = new ImageIcon(getClass().getResource("/imgs/casa_vazia.jpg")).getImage();
    public Imagens(){

    }

    public  Image getCasaVazia() {
        return casaVazia;
    }

    public Image getPecaBranca() {
        return pecaBranca;
    }

    public Image getPecaBrancaSelecionada() {
        return pecaBrancaSelecionada;
    }

    public Image getPecaPreta() {
        return pecaPreta;
    }

    public Image getPecaPretaSelecionada() {
        return pecaPretaSelecionada;
    }

    

}
