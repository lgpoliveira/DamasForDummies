/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// 1 para branca 0 para preta
package Controller;

/**
 *
 * @author Guga
 */
public class Peca {
    int cor;
    boolean isDama;

    public Peca(int cor) {
        this.cor = cor;
        this.isDama = false;
    }

    public int getCor() {
        return cor;
    }

    public boolean isDama() {
        return isDama;
    }

    public void setIsDama(boolean isDama) {
        this.isDama = isDama;
    }
    

}
